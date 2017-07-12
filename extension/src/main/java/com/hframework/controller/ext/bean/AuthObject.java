package com.hframework.controller.ext.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangquanhong on 2017/6/7.
 */
public  class AuthObject{
    public Long tableId;
    public String tableName;
    public List<AuthObjectAttr> authObjectAttrs = new ArrayList<AuthObjectAttr>();
    public List<AuthObjectAttr> authObjectKeyAttrs = new ArrayList<AuthObjectAttr>();
    public List<Object> keyAttrs = new ArrayList<Object>();

    @Override
    public int hashCode() {
        return tableId.hashCode() + tableName.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}

