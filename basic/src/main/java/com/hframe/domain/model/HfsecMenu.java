package com.hframe.domain.model;

import java.math.BigDecimal;
import java.util.Date;

public class HfsecMenu {
    private Long hfsecMenuId;

    private String hfsecMenuCode;

    private String hfsecMenuName;

    private String hfsecMenuDesc;

    private Integer menuLevel;

    private String icon;

    private String url;

    private Long parentHfsecMenuId;

    private BigDecimal pri;

    private Long creatorId;

    private Date createTime;

    private Long modifierId;

    private Date modifyTime;

    private Integer delFlag;

    public HfsecMenu(Long hfsecMenuId, String hfsecMenuCode, String hfsecMenuName, String hfsecMenuDesc, Integer menuLevel, String icon, String url, Long parentHfsecMenuId, BigDecimal pri, Long creatorId, Date createTime, Long modifierId, Date modifyTime, Integer delFlag) {
        this.hfsecMenuId = hfsecMenuId;
        this.hfsecMenuCode = hfsecMenuCode;
        this.hfsecMenuName = hfsecMenuName;
        this.hfsecMenuDesc = hfsecMenuDesc;
        this.menuLevel = menuLevel;
        this.icon = icon;
        this.url = url;
        this.parentHfsecMenuId = parentHfsecMenuId;
        this.pri = pri;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.modifierId = modifierId;
        this.modifyTime = modifyTime;
        this.delFlag = delFlag;
    }

    public Long getHfsecMenuId() {
        return hfsecMenuId;
    }

    public String getHfsecMenuCode() {
        return hfsecMenuCode;
    }

    public String getHfsecMenuName() {
        return hfsecMenuName;
    }

    public String getHfsecMenuDesc() {
        return hfsecMenuDesc;
    }

    public Integer getMenuLevel() {
        return menuLevel;
    }

    public String getIcon() {
        return icon;
    }

    public String getUrl() {
        return url;
    }

    public Long getParentHfsecMenuId() {
        return parentHfsecMenuId;
    }

    public BigDecimal getPri() {
        return pri;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Long getModifierId() {
        return modifierId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public Integer getDelFlag() {
        return delFlag;
    }

    public void setHfsecMenuId(Long hfsecMenuId) {
        this.hfsecMenuId=hfsecMenuId;
    }

    public void setHfsecMenuCode(String hfsecMenuCode) {
        this.hfsecMenuCode=hfsecMenuCode;
    }

    public void setHfsecMenuName(String hfsecMenuName) {
        this.hfsecMenuName=hfsecMenuName;
    }

    public void setHfsecMenuDesc(String hfsecMenuDesc) {
        this.hfsecMenuDesc=hfsecMenuDesc;
    }

    public void setMenuLevel(Integer menuLevel) {
        this.menuLevel=menuLevel;
    }

    public void setIcon(String icon) {
        this.icon=icon;
    }

    public void setUrl(String url) {
        this.url=url;
    }

    public void setParentHfsecMenuId(Long parentHfsecMenuId) {
        this.parentHfsecMenuId=parentHfsecMenuId;
    }

    public void setPri(BigDecimal pri) {
        this.pri=pri;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId=creatorId;
    }

    public void setCreateTime(Date createTime) {
        this.createTime=createTime;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId=modifierId;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime=modifyTime;
    }

    public void setDelFlag(Integer delFlag) {
        this.delFlag=delFlag;
    }

    public HfsecMenu() {
        super();
    }
}