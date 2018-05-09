package com.hframework.controller.ext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.google.common.collect.Lists;
import com.hframe.domain.model.*;
import com.hframe.service.interfaces.*;
import com.hframework.base.service.CommonDataService;
import com.hframework.base.service.DataSetLoaderService;
import com.hframework.base.service.ModelLoaderService;
import com.hframework.beans.class0.*;
import com.hframework.beans.class0.Class;
import com.hframework.beans.controller.ResultCode;
import com.hframework.beans.controller.ResultData;
import com.hframework.common.frame.ServiceFactory;
import com.hframework.common.util.BeanUtils;
import com.hframework.common.util.ReflectUtils;
import com.hframework.common.util.StringUtils;
import com.hframework.common.util.collect.CollectionUtils;
import com.hframework.common.util.collect.bean.Fetcher;
import com.hframework.common.util.collect.bean.Grouper;
import com.hframework.controller.ext.bean.AuthManager;
import com.hframework.controller.ext.bean.AuthObject;
import com.hframework.web.CreatorUtil;
import com.hframework.web.context.ComponentDescriptor;
import com.hframework.web.context.PageDescriptor;
import com.hframework.web.controller.DefaultController;
import com.hframework.common.springext.datasource.DataSourceContextHolder;
import com.hframework.web.context.WebContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.MessageFormat;
import java.util.*;

/**
 * Created by zhangquanhong on 2016/12/11.
 */
@Controller
@RequestMapping(value = "/extend")
public class MenuGeneratorController extends ExtBaseController {
    private static final Logger logger = LoggerFactory.getLogger(MenuGeneratorController.class);
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


    /**
     * menuChart初始化处理
     * @return
     */
    @RequestMapping(value = "/menu_chart.json")
    @ResponseBody
    public ResultData getMenuChart(HttpServletRequest request){
        logger.debug("request : {}");
        try{
            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());

            String companyCode = "hframe";
            String programCode = "hframe";
            Long programId = -1L;
            String programeName = "框架";
            String moduleCode = "hframe";
            String moduleName = "框架";
            if(pageFlowParams != null) {
                if(pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
                    programCode = program.getHfpmProgramCode();
                    programeName = program.getHfpmProgramName();
                    programId = program.getHfpmProgramId();
                }
                if(pageFlowParams.containsKey("hfpmModuleId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmModuleId"))) {
                    HfpmModule module = hfpmModuleSV.getHfpmModuleByPK(Long.parseLong(pageFlowParams.get("hfpmModuleId")));
                    moduleCode = module.getHfpmModuleCode();
                    moduleName = module.getHfpmModuleName();
                }
            }
            final AuthManager authManager = AuthManager.load(iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV, programId);
            AuthManager.calcAuthObjectKeyAttr(authManager.func, AuthManager.funcModel);


            startDynamicDataSource(pageFlowParams);
            List<Map<String, Object>> curFuncList = AuthManager.getDynamicTableDataSome(commonDataService,calcSelectSql(authManager.func.get(0),
                    Lists.newArrayList("hfsecMenuId","hfsecMenuCode", "hfsecMenuName", "hfsecMenuDesc", "parentHfsecMenuId", "icon", "url")));
            List<HfsecMenu> curMenuList = CollectionUtils.fetch(curFuncList, new Fetcher<Map<String, Object>, HfsecMenu>() {
                public HfsecMenu fetch(Map<String, Object> objectMap) {
                    return BeanUtils.convertObject(HfsecMenu.class, objectMap);
                }
            });
            HfsecMenu  virtualNode = new HfsecMenu();
            virtualNode.setParentHfsecMenuId(-1L);
            virtualNode.setHfsecMenuId(-2L);
            virtualNode.setHfsecMenuName("未设置菜单");
            curMenuList.add(virtualNode);
            final Map<Long, List<HfsecMenu>> result = CollectionUtils.group(curMenuList, new Grouper<Long, HfsecMenu>() {
                public <K> K groupKey(HfsecMenu menu) {
                    return (K) menu.getParentHfsecMenuId();
                }
            });

//
//            HfsecMenu_Example hfsecMenuExample = new HfsecMenu_Example();
//            HfsecMenu hfsecMenu = new HfsecMenu();
//            hfsecMenu.setParentHfsecMenuId(-1L);
//            final Map<Long, List<HfsecMenu>> result = hfsecMenuSV.getHfsecMenuTreeByParentId(hfsecMenu, hfsecMenuExample);
//
//            HfsecMenu  virtualNode = new HfsecMenu();
//            virtualNode.setParentHfsecMenuId(-1L);
//            virtualNode.setHfsecMenuId(-2L);
//            virtualNode.setHfsecMenuName("未设置菜单");
//            if(!result.containsKey(-1L)) result.put(-1L, new ArrayList<HfsecMenu>());
//            result.get(-1L).add(virtualNode);
//
//            hfsecMenuExample = new HfsecMenu_Example();
//            hfsecMenu.setParentHfsecMenuId(-2L);
//            Map<Long, List<HfsecMenu>> virtualMenus = hfsecMenuSV.getHfsecMenuTreeByParentId(hfsecMenu, hfsecMenuExample);
//            if(virtualMenus.containsKey(-2L)) {
//
//                result.putAll(virtualMenus);
//            }

            return ResultData.success(new HashMap<String,Object>(){{
                put("AllMenuTree",result);
            }});
        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }finally {
            DataSourceContextHolder.clear();
        }
    }

    public static String calcSelectSql(AuthObject object, List<String> aliasList) {
        StringBuffer sb = new StringBuffer("select ");
        int i = 0;

        sb.append("`").append(AuthManager.calcField(Lists.newArrayList("{pk}", "id"), object.authObjectAttrs))
                .append("` as ").append(aliasList.get(i++)).append(", ");
        for (Object keyAttr : object.keyAttrs) {
            sb.append("`").append(keyAttr).append("` as ").append(aliasList.get(i++)).append(", ");
        }
        return sb.substring(0,sb.length()-2) + " from " + object.tableName + ";";
    }


    /**
     * 数据保存
     * @return
     */
    @RequestMapping(value = "/save_menu.json")
    @ResponseBody
    public ResultData saveData(HttpServletRequest request,
                               HttpServletResponse response){

        try{
            Map<String, String>  pageContextParams = DefaultController.getPageContextParams(request);
            WebContext.putContext(DefaultController.getPageContextRealyParams(pageContextParams));
            Map<String, String> pageFlowParams = WebContext.get(HashMap.class.getName());
            Long programId = -1L;
            if(pageFlowParams != null) {
                if (pageFlowParams.containsKey("hfpmProgramId") && StringUtils.isNotBlank(pageFlowParams.get("hfpmProgramId"))) {
                    HfpmProgram program = hfpmProgramSV.getHfpmProgramByPK(Long.parseLong(pageFlowParams.get("hfpmProgramId")));
                    programId = program.getHfpmProgramId();
                }
            }

            final AuthManager authManager = AuthManager.load(iHfpmProgramCfgSV, iHfmdEntitySV, hfmdEntityAttrSV, programId);
            AuthManager.calcAuthObjectKeyAttr(authManager.func, AuthManager.funcModel);
            startDynamicDataSource(pageFlowParams);

            String dataJson = DefaultController.getRequestPostStr(request);
            JSONObject jsonObject = JSONObject.parseObject(dataJson, Feature.OrderedField);
            Object parentObject = null;
            Map<String, String> result = new LinkedHashMap<String, String>();
            JSONObject jsonObject1 = JSONObject.parseObject(jsonObject.getString("treeChart"));
            if(jsonObject1 == null) {
                jsonObject1 = JSONObject.parseObject(jsonObject.getString("treeChart|0"));
            }
            parseRelatMap(jsonObject1, result);

            AuthObject funcObject = authManager.func.get(0);
            List sqlList = new ArrayList();
            String format = "update {0} set {1} = {2} where {3} = {4}";
            for (Map.Entry<String, String> newRel : result.entrySet()) {
                String keyValue = newRel.getKey();
                String parentKeyValue = newRel.getValue();
                String keyProperty = AuthManager.calcField(Lists.newArrayList("{pk}", "id"), funcObject.authObjectAttrs);
                sqlList.add(MessageFormat.format(format, funcObject.tableName, funcObject.keyAttrs.get(3), parentKeyValue, keyProperty, keyValue));
            }
            commonDataService.executeDBStructChange(sqlList);
            return ResultData.success(parentObject);

        }catch (Exception e) {
            logger.error("error : ", e);
            return ResultData.error(ResultCode.ERROR);
        }finally {
            DataSourceContextHolder.clear();
        }
    }

    private void parseRelatMap(JSONObject jsonObject1, Map<String, String> result) {

        String id = jsonObject1.getString("id");
        JSONArray children = jsonObject1.getJSONArray("children");
        if(children == null) {
            return ;
        }
        Iterator<Object> iterator = children.iterator();
        while (iterator.hasNext()) {
            JSONObject next = (JSONObject) iterator.next();
            String subId = next.getString("id");
            result.put(subId,id);
            parseRelatMap(next, result);
        }
    }


}
