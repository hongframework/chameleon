package com.hframework.controller.ext;

import com.google.common.base.Strings;
import com.hframe.domain.model.HfpmModule;
import com.hframe.domain.model.HfpmProgram;
import com.hframe.domain.model.HfsecMenu;
import com.hframe.domain.model.HfsecMenu_Example;
import com.hframe.service.interfaces.*;
import com.hframework.base.service.CommonDataService;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.base.service.ModelLoaderService;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.common.springext.datasource.DataSourceContextHolder;
import com.hframework.common.util.StringUtils;
import com.hframework.common.util.cmd.ShellExecutor;
import com.hframework.generator.util.CreatorUtil;
import com.hframework.web.context.WebContext;
import com.hframework.web.controller.DefaultController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangquanhong on 2016/12/11.
 */
@Controller
@RequestMapping(value = "/extend")
public class ApplicationManageController extends ExtBaseController {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationManageController.class);
    @Resource
    private DataSetLoaderService dataSetLoaderService;

    @Resource
    private ModelLoaderService modelLoaderService;
    @Resource
    private CommonDataService commonDataService;

    @Resource
    private IHfpmProgramSV hfpmProgramSV;

    @Resource
    private IHfsecMenuSV hfsecMenuSV;

    @Resource
    private IHfsecUserSV hfsecUserSV;


    @Resource
    private IHfpmModuleSV hfpmModuleSV;

    @Resource
    private IHfcfgDbConnectSV iHfcfgDbConnectSV;
    @Resource
    private IHfpmProgramCfgSV iHfpmProgramCfgSV;

    @Resource
    private IHfusEntityStoreSV hfusEntityStoreSV;

    @Resource
    private IHfsecMenuSV iHfsecMenuSV;

    @Resource
    private IHfmdEntitySV iHfmdEntitySV;

    @Resource
    private IHfmdEntityAttrSV hfmdEntityAttrSV;

    private static final Map<Long, Thread> applicationInfos = new HashMap<Long, Thread>();


    /**
     * menuChart初始化处理
     * @return
     */
    @RequestMapping(value = "/application_manage.json")
    @ResponseBody
    public ResultData applicationManageList(HttpServletRequest request){
        logger.debug("request : {}");
        try{
            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());

            final List<Map<String, String>> result = new ArrayList<Map<String, String>>();
            if(pageFlowParams != null) {
                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));

                    String programIdStr = Strings.padStart(program.getHfpmProgramId().toString(), 4, '0');
                    String port = "1" + programIdStr.substring(programIdStr.length() - 4);
                    Map<String, String> programInfo = new HashMap<String, String>();
                    programInfo.put("hfpmProgramId", String.valueOf(program.getHfpmProgramId()));
                    programInfo.put("hfpmProgramName",program.getHfpmProgramName());
                    programInfo.put("hfpmProgramCode", program.getHfpmProgramCode());
                    programInfo.put("url", "127.0.0.1:" + port);
                    programInfo.put("state", applicationInfos.containsKey(program.getHfpmProgramId()) ? "已启动": "未启动");
                    result.add(programInfo);
                }
            }

            if(result.isEmpty()) {
                List<HfpmProgram> hfpmProgramAll = hfpmProgramSV.getHfpmProgramAll();
                for (HfpmProgram program : hfpmProgramAll) {
                    String programIdStr = Strings.padStart(program.getHfpmProgramId().toString(), 4, '0');
                    String port = "1" + programIdStr.substring(programIdStr.length() - 4);
                    Map<String, String> programInfo = new HashMap<String, String>();
                    programInfo.put("hfpmProgramId", String.valueOf(program.getHfpmProgramId()));
                    programInfo.put("hfpmProgramName",program.getHfpmProgramName());
                    programInfo.put("hfpmProgramCode", program.getHfpmProgramCode());
                    programInfo.put("url", "127.0.0.1:" + port);
                    programInfo.put("state", applicationInfos.containsKey(program.getHfpmProgramId()) ? "已启动": "未启动");
                    result.add(programInfo);
                }
            }

            return ResultData.success(new HashMap<String,Object>(){{
                put("applicationInfo", new HashMap<String, Object>() {{
                    put("list", result);
                }});
            }});
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }finally {
            DataSourceContextHolder.clear();
        }
    }


    /**
     * 数据保存
     * @return
     */
    @RequestMapping(value = "/application_operate.json")
    @ResponseBody
    public ResultData saveData(HttpServletRequest request,
                               HttpServletResponse response){
        String type = request.getParameter("type");
        String id = request.getParameter("id");
        try {
            HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(id));
            final String projectBasePath = CreatorUtil.getTargetProjectBasePath(program.getOwnerCode(), program.getHfpmProgramCode(),"MM");

            if("2".equals(type) || "3".equals(type)) {
                applicationInfos.remove(program.getHfpmProgramId()).stop();
                Thread.sleep(300);
            }

            if("1".equals(type) || "2".equals(type) ) {
                applicationInfos.put(program.getHfpmProgramId(), new Thread(new Runnable() {
                    public void run() {
                        ShellExecutor.exeCmd(projectBasePath + "/build/startup.bat");
                    }
                }));
                applicationInfos.get(program.getHfpmProgramId()).start();
            }
        } catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }

        return ResultData.success();
    }




}
