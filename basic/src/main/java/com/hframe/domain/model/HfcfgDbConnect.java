package com.hframe.domain.model;

import java.util.Date;

public class HfcfgDbConnect {
    private Long hfcfgDbConnectId;

    private String hfcfgDbConnectName;

    private String password;

    private String url;

    private String user;

    private Long creatorId;

    private Date createTime;

    private String hfcfgDbConnectCode;

    public HfcfgDbConnect(Long hfcfgDbConnectId, String hfcfgDbConnectName, String password, String url, String user, Long creatorId, Date createTime, String hfcfgDbConnectCode) {
        this.hfcfgDbConnectId = hfcfgDbConnectId;
        this.hfcfgDbConnectName = hfcfgDbConnectName;
        this.password = password;
        this.url = url;
        this.user = user;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.hfcfgDbConnectCode = hfcfgDbConnectCode;
    }

    public Long getHfcfgDbConnectId() {
        return hfcfgDbConnectId;
    }

    public String getHfcfgDbConnectName() {
        return hfcfgDbConnectName;
    }

    public String getPassword() {
        return password;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public String getHfcfgDbConnectCode() {
        return hfcfgDbConnectCode;
    }

    public void setHfcfgDbConnectId(Long hfcfgDbConnectId) {
        this.hfcfgDbConnectId=hfcfgDbConnectId;
    }

    public void setHfcfgDbConnectName(String hfcfgDbConnectName) {
        this.hfcfgDbConnectName=hfcfgDbConnectName;
    }

    public void setPassword(String password) {
        this.password=password;
    }

    public void setUrl(String url) {
        this.url=url;
    }

    public void setUser(String user) {
        this.user=user;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId=creatorId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime=createTime;
    }

    public void setHfcfgDbConnectCode(String hfcfgDbConnectCode) {
        this.hfcfgDbConnectCode=hfcfgDbConnectCode;
    }

    public HfcfgDbConnect() {
        super();
    }
}