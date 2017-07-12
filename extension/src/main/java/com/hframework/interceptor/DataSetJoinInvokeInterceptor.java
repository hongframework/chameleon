package com.hframework.interceptor;

import com.hframe.domain.model.*;
import com.hframe.service.interfaces.IHfmdEntityAttrSV;
import com.hframe.service.interfaces.IHfmdEntitySV;
import com.hframe.service.interfaces.IHfmdEnumClassSV;
import com.hframe.service.interfaces.IHfpmModuleSV;
import com.hframework.common.util.BeanUtils;
import com.hframework.generator.web.container.HfModelContainer;
import com.hframework.generator.web.container.HfModelContainerUtil;
import com.hframework.generator.web.container.bean.Module;
import com.hframework.generator.web.container.bean.Program;
import com.hframework.generator.web.sql.HfModelService;
import com.hframework.generator.web.sql.reverse.SQLParseUtil;
import com.hframework.web.context.WebContextHelper;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * 数据集连带规则拦截器
 * TODO 需要读取配置进行连带实现，而非硬编码
 * Created by zhangquanhong on 2016/8/28.
 */
@Component
@Aspect
public class DataSetJoinInvokeInterceptor {

    private static final long ENUM_CLASS_DEFAULT_HOLDER = 2;

    @Resource
    private IHfpmModuleSV hfpmModuleSV;

    @Resource
    private IHfmdEntitySV hfmdEntitySV;

    @Resource
    private IHfmdEntityAttrSV hfmdEntityAttrSV;

    @Resource
    private IHfmdEnumClassSV hfmdEnumClassSV;

    @Pointcut("execution(* com.hframe.service.impl.*.create(..))")
    private void addMethod(){ }

    @Pointcut("execution(int com.hframe.service.impl.*.update*(..))")
    private void modMethod(){ }

    @Pointcut("execution(int com.hframe.service.impl.*.batchOperate*(..))")
    private void batchOperateMethod(){ }

    @Pointcut("execution(int com.hframe.service.impl.*.delete*(..))")
    private void deleteMethod(){ }

    @AfterReturning(pointcut = "batchOperateMethod()", returning = "retVal")
    public void batchOperateAfterReturning(JoinPoint joinPoint, int retVal) {
        joinInvoke(joinPoint,retVal);
    }

    @AfterReturning(pointcut = "addMethod()", returning = "retVal")
    public void addMethodAfterReturning(JoinPoint joinPoint, int retVal) {
        joinInvoke(joinPoint, retVal);
    }

    @Before(value = "batchOperateMethod()")
    public void batchOperateBefore(JoinPoint joinPoint) {
        beforeJoinInvoke(joinPoint);
    }

    @Before(value = "addMethod()")
    public void addMethodBefore(JoinPoint joinPoint) {
        beforeJoinInvoke(joinPoint);
    }



    public void beforeJoinInvoke(JoinPoint joinPoint) {
    }


    public void joinInvoke(JoinPoint joinPoint, int retVal) {
        if(retVal > 0) {
            Object originObject = joinPoint.getArgs()[0];
//            Class<?> originClass = originObject.getClass();
//            programJoinBaseEntitys(originObject);
//            entityAttrDefaultEnumSetting(originObject);
        }
    }

    private void entityAttrDefaultEnumSetting(Object originObject) {
        try {
            if (originObject instanceof HfmdEntityAttr ||
                    (originObject.getClass().isArray() && ((Object[])originObject)[0] instanceof HfmdEntityAttr)) {

                Object[] datas;
                if(originObject.getClass().isArray()){
                    datas = ((Object[])originObject);
                }else {
                    datas = new Object[]{originObject};
                }

                for (Object data : datas) {
                    HfmdEntityAttr hfmdEntityAttr = (HfmdEntityAttr) data;
                    if(hfmdEntityAttr.getHfmdEnumClassId() != null
                            && hfmdEntityAttr.getHfmdEnumClassId() == ENUM_CLASS_DEFAULT_HOLDER) {
                        HfmdEntity hfmdEntity = hfmdEntitySV.getHfmdEntityByPK(hfmdEntityAttr.getHfmdEntityId());

                        HfmdEnumClass_Example example = new HfmdEnumClass_Example();
                        example.createCriteria().andHfmdEnumClassCodeEqualTo(hfmdEntity.getHfmdEntityCode() + "." + hfmdEntityAttr.getHfmdEntityAttrCode());
                        List<HfmdEnumClass> hfmdEnumClassCountByExample = hfmdEnumClassSV.getHfmdEnumClassListByExample(example);
                        long classId = -1;
                        if(hfmdEnumClassCountByExample == null || hfmdEnumClassCountByExample.size() == 0) {
                            HfmdEnumClass enumClass = new HfmdEnumClass();
                            enumClass.setHfmdEnumClassName(hfmdEntity.getHfmdEntityName() + "-" + hfmdEntityAttr.getHfmdEntityAttrName());
                            enumClass.setHfmdEnumClassCode(hfmdEntity.getHfmdEntityCode() + "." + hfmdEntityAttr.getHfmdEntityAttrCode());
                            enumClass.setHfmdEnumClassDesc(hfmdEntityAttr.getHfmdEntityAttrName());
                            enumClass.setHfpmProgramId(hfmdEntityAttr.getHfpmProgramId());
                            hfmdEnumClassSV.create(enumClass);
                            classId = enumClass.getHfmdEnumClassId();
                        }else {
                            classId = hfmdEnumClassCountByExample.get(0).getHfmdEnumClassId();
                        }
                        hfmdEntityAttr.setHfmdEnumClassId(classId);
                        hfmdEntityAttrSV.update(hfmdEntityAttr);

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void programJoinBaseEntitys(Object originObject) {
        try {

            if(originObject.getClass().isArray()) {
                originObject = ((Object[])originObject)[0];
            }

            if (originObject instanceof HfpmProgram) {
                HfpmProgram program = (HfpmProgram) originObject;

                final HfpmModule hframeModule = new HfpmModule();
                hframeModule.setHfpmProgramId(program.getHfpmProgramId());
                hframeModule.setHfpmModuleCode("hframe");
                hframeModule.setHfpmModuleName("框架默认");
                hframeModule.setHfpmModuleDesc("框架默认");
                hfpmModuleSV.create(hframeModule);


                WebContextHelper contextHelper = new WebContextHelper("hframe", "trunk", "hframe", "hframe");
                String sqlFile = contextHelper.programConfigRootDir + "/init/sql/entitys.sql";
                final HfModelContainer sqlFileModelContainer = SQLParseUtil.parseModelContainerFromSQLFile(
                        sqlFile, program.getHfpmProgramCode(), program.getHfpmProgramName(), hframeModule.getHfpmModuleCode(),hframeModule.getHfpmModuleName());
                final HfModelContainer baseModelContainer = HfModelContainerUtil.getInstance();
                baseModelContainer.setProgram(BeanUtils.convertObject(Program.class, program));
                baseModelContainer.setModuleMap(new HashMap<Long, Module>(){{
                    put(hframeModule.getHfpmModuleId(), BeanUtils.convertObject(Module.class, hframeModule));
                }});
                HfModelContainer[] resultModelContainers =
                        HfModelContainerUtil.mergerModelContainer(baseModelContainer, sqlFileModelContainer);
                HfModelService.get().executeModelInsert(resultModelContainers[0]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
