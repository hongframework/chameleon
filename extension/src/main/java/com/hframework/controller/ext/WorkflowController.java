package com.hframework.controller.ext;

import com.hframe.domain.model.HfpmDataField;
import com.hframe.domain.model.HfpmDataField_Example;
import com.hframe.service.interfaces.IHfpmDataFieldSV;
import com.hframework.common.util.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by zhangquanhong on 2017/1/16.
 */
@Controller
public class WorkflowController {

    @Resource
    private IHfpmDataFieldSV hfpmDataFieldSV;

    /**
     * 页面跳转
     * @return
     * @throws Throwable
     */
    @RequestMapping(value = "/modeler.html")
    public ModelAndView modeler(@ModelAttribute("modelId") String modelId, @ModelAttribute("dataSetId") String dataSetId,

                                HttpServletRequest request, HttpServletResponse response) throws Throwable {
        ModelAndView mav = new ModelAndView();

        if(StringUtils.isBlank(modelId) && dataSetId != null && StringUtils.isNotBlank(dataSetId)) {
            HfpmDataField_Example example = new HfpmDataField_Example();
            example.createCriteria().andHfpmDataSetIdEqualTo(Long.valueOf(dataSetId)).andWorkfowModelIdIsNotNull().andWorkfowModelIdNotEqualTo("");
            List<HfpmDataField> hfpmDataFieldListByExample = hfpmDataFieldSV.getHfpmDataFieldListByExample(example);
            if(hfpmDataFieldListByExample != null && hfpmDataFieldListByExample.size() > 0) {
                modelId = hfpmDataFieldListByExample.get(0).getWorkfowModelId();
            }
        }

        mav.addObject("modelId", modelId);

        mav.setViewName("/modeler");
        return mav;
    }

}
