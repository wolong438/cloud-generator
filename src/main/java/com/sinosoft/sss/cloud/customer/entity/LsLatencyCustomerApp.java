package com.sinosoft.sss.cloud.customer.entity;

import java.util.Date;

public class LsLatencyCustomerApp {
    /**
     * 客户号码
     */
    private String customerNo;

    /**
     * 客户姓名
     */
    private String name;

    /**
     * 姓名全拼
     */
    private String namePinyin;

    /**
     * 信息完整度, 0：完整 1：未完整
     */
    private String infoIntegrity;

    /**
     * 客户性别, 0:男 1:女
     */
    private String sex;

    /**
     * 客户出生日期， 格式yyyy-MM-dd
     */
    private String birthday;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 证件类型
     */
    private String idType;

    /**
     * 证件号码
     */
    private String idNo;

    /**
     * 证件有效期
     */
    private Date idvalidityDate;

    /**
     * 国籍
     */
    private String countryArea;

    /**
     * 婚姻状况
     */
    private String marriage;

    /**
     * 学历
     */
    private String degree;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 爱好
     */
    private String interest;

    /**
     * 手机号1
     */
    private String mobilePhoneOne;

    /**
     * 手机号2
     */
    private String mobilePhoneTwo;

    /**
     * 固定电话
     */
    private String fixedTelephone;

    /**
     * 单位名称
     */
    private String grpName;

    /**
     * 职业名称
     */
    private String occupationName;

    /**
     * 职业代码
     */
    private String occupationCode;

    /**
     * 职业等级
     */
    private String occupationGrade;

    /**
     * 缴纳的保险费的收入来源，gz：工资收入 jj:奖金或分红 tz:投资收益 qt:其它
     */
    private String incomeSource;

    /**
     * 收入来源其他备注说明
     */
    private String incomeSourceRemark;

    /**
     * 年收入
     */
    private String yearSalary;

    /**
     * 保单选择，电子保单、纸质保单
     */
    private String plicySelection;

    /**
     * 客户特色信息
     */
    private String remark;

    /**
     * 营销员工号
     */
    private String agentCode;

    /**
     * 逻辑删除标示，1:已删除 0或者空：未删除
     */
    private String deleteFlag;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePinyin() {
        return namePinyin;
    }

    public void setNamePinyin(String namePinyin) {
        this.namePinyin = namePinyin;
    }

    public String getInfoIntegrity() {
        return infoIntegrity;
    }

    public void setInfoIntegrity(String infoIntegrity) {
        this.infoIntegrity = infoIntegrity;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public Date getIdvalidityDate() {
        return idvalidityDate;
    }

    public void setIdvalidityDate(Date idvalidityDate) {
        this.idvalidityDate = idvalidityDate;
    }

    public String getCountryArea() {
        return countryArea;
    }

    public void setCountryArea(String countryArea) {
        this.countryArea = countryArea;
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public String getMobilePhoneOne() {
        return mobilePhoneOne;
    }

    public void setMobilePhoneOne(String mobilePhoneOne) {
        this.mobilePhoneOne = mobilePhoneOne;
    }

    public String getMobilePhoneTwo() {
        return mobilePhoneTwo;
    }

    public void setMobilePhoneTwo(String mobilePhoneTwo) {
        this.mobilePhoneTwo = mobilePhoneTwo;
    }

    public String getFixedTelephone() {
        return fixedTelephone;
    }

    public void setFixedTelephone(String fixedTelephone) {
        this.fixedTelephone = fixedTelephone;
    }

    public String getGrpName() {
        return grpName;
    }

    public void setGrpName(String grpName) {
        this.grpName = grpName;
    }

    public String getOccupationName() {
        return occupationName;
    }

    public void setOccupationName(String occupationName) {
        this.occupationName = occupationName;
    }

    public String getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode;
    }

    public String getOccupationGrade() {
        return occupationGrade;
    }

    public void setOccupationGrade(String occupationGrade) {
        this.occupationGrade = occupationGrade;
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public String getIncomeSourceRemark() {
        return incomeSourceRemark;
    }

    public void setIncomeSourceRemark(String incomeSourceRemark) {
        this.incomeSourceRemark = incomeSourceRemark;
    }

    public String getYearSalary() {
        return yearSalary;
    }

    public void setYearSalary(String yearSalary) {
        this.yearSalary = yearSalary;
    }

    public String getPlicySelection() {
        return plicySelection;
    }

    public void setPlicySelection(String plicySelection) {
        this.plicySelection = plicySelection;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
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