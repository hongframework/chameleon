package com.hframe.domain.enums;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by zhangquanhong on 2017/1/16.
 */
public class CommonEnum {
    protected static Map<Object, String> enums = new LinkedHashMap<Object, String>();

    public Map<Object, String> getEnums() {
        return enums;
    }

    public void setEnums(Map<Object, String> enums) {
        this.enums = enums;
    }

}
