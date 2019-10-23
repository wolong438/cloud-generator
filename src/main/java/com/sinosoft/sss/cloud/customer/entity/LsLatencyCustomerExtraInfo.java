package com.sinosoft.sss.cloud.customer.entity;

import java.util.Date;

public class LsLatencyCustomerExtraInfo {
    /**
     * 客户编号
     */
    private String customerNo;

    /**
     * 是否有子女，1是   0否
     */
    private String hasChild;

    /**
     * 子女数量
     */
    private Integer childNum;

    /**
     * 微信号
     */
    private String wechatNumber;

    /**
     * 微信openId
     */
    private String wxOpenid;

    /**
     * 微信头像
     */
    private String wxHeadImg;

    /**
     * 微信昵称
     */
    private String wxNickName;

    /**
     * 客户来源类型，a001:E行销系统，a002:保单系统,a003:E行销系统且保单系统，a004:客户市场活动 b001:缘故  b002:线下活动  b003.转介绍  b004.递归  b005.陌生拜访  b006主动上门 a000其他 （E行销系统时默认为a001）
     */
    private String sourceType;

    /**
     * 来源子类型，b001:缘故 b002:线下活动 b003.转介绍 b004.递归 b005.陌生拜访 b006主动上门
     */
    private String subSourceType;

    /**
     * 客户与营销员关系，1亲属、2朋友、3同学、4同事、5宗教、6战友、7其他
     */
    private String relationship;

    /**
     * 亲密度，1、2、3、4、5
     */
    private String degreeOfIntimacy;

    /**
     * 工作单位/公司
     */
    private String company;

    /**
     * 工作内容
     */
    private String jobContent;

    /**
     * 房产数量
     */
    private Integer houseCount;

    /**
     * 私家车数量
     */
    private Integer carCount;

    /**
     * 其他资产
     */
    private String otherAssets;

    /**
     * 负债情况，（1有，0无）
     */
    private String liabilitiesStatus;

    /**
     * 客户标签（数组）
     */
    private String labels;

    /**
     * 印象，eg. ["美女","客户","同事"]
     */
    private String impression;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getHasChild() {
        return hasChild;
    }

    public void setHasChild(String hasChild) {
        this.hasChild = hasChild;
    }

    public Integer getChildNum() {
        return childNum;
    }

    public void setChildNum(Integer childNum) {
        this.childNum = childNum;
    }

    public String getWechatNumber() {
        return wechatNumber;
    }

    public void setWechatNumber(String wechatNumber) {
        this.wechatNumber = wechatNumber;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    public String getWxHeadImg() {
        return wxHeadImg;
    }

    public void setWxHeadImg(String wxHeadImg) {
        this.wxHeadImg = wxHeadImg;
    }

    public String getWxNickName() {
        return wxNickName;
    }

    public void setWxNickName(String wxNickName) {
        this.wxNickName = wxNickName;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSubSourceType() {
        return subSourceType;
    }

    public void setSubSourceType(String subSourceType) {
        this.subSourceType = subSourceType;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getDegreeOfIntimacy() {
        return degreeOfIntimacy;
    }

    public void setDegreeOfIntimacy(String degreeOfIntimacy) {
        this.degreeOfIntimacy = degreeOfIntimacy;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobContent() {
        return jobContent;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent;
    }

    public Integer getHouseCount() {
        return houseCount;
    }

    public void setHouseCount(Integer houseCount) {
        this.houseCount = houseCount;
    }

    public Integer getCarCount() {
        return carCount;
    }

    public void setCarCount(Integer carCount) {
        this.carCount = carCount;
    }

    public String getOtherAssets() {
        return otherAssets;
    }

    public void setOtherAssets(String otherAssets) {
        this.otherAssets = otherAssets;
    }

    public String getLiabilitiesStatus() {
        return liabilitiesStatus;
    }

    public void setLiabilitiesStatus(String liabilitiesStatus) {
        this.liabilitiesStatus = liabilitiesStatus;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getImpression() {
        return impression;
    }

    public void setImpression(String impression) {
        this.impression = impression;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}