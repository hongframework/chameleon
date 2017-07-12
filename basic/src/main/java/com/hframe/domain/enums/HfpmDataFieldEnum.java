package com.hframe.domain.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by zhangquanhong on 2017/1/16.
 */
public  class HfpmDataFieldEnum extends CommonEnum{



    public  enum DataGetMethod {
        INPUT(0,"手工录入"),
        AUTO(2,"自动生成"),
        TRIGGER(3,"规则触发"),
        WORKFLOW(4,"流转节点");

        DataGetMethod(int index, String name) {
            enums.put(index, name);
        }

        public static boolean isInput(int index) {
            return index == 0;
        }

        public static boolean isWorkflow(int index) {
            return index == 4;
        }
    }
}
