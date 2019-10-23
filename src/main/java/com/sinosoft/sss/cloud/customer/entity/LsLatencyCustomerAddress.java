package com.sinosoft.sss.cloud.customer.entity;

import java.util.Date;

public class LsLatencyCustomerAddress {
    /**
     * 地址编号
     */
    private String addressNo;

    /**
     * 客户编码
     */
    private String customerNo;

    /**
     * 地址类型：身份证地址、家庭地址、单位地址、通讯地址
     */
    private String addressType;

    /**
     * 省
     */
    private String provinceAddr;

    /**
     * 市
     */
    private String cityAddr;

    /**
     * 区
     */
    private String areaAddr;

    /**
     * 详细地址
     */
    private String detailedAddress;

    /**
     * 邮政编码
     */
    private String zipCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    public String getAddressNo() {
        return addressNo;
    }

    public void setAddressNo(String addressNo) {
        this.addressNo = addressNo;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    public String getProvinceAddr() {
        return provinceAddr;
    }

    public void setProvinceAddr(String provinceAddr) {
        this.provinceAddr = provinceAddr;
    }

    public String getCityAddr() {
        return cityAddr;
    }

    public void setCityAddr(String cityAddr) {
        this.cityAddr = cityAddr;
    }

    public String getAreaAddr() {
        return areaAddr;
    }

    public void setAreaAddr(String areaAddr) {
        this.areaAddr = areaAddr;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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