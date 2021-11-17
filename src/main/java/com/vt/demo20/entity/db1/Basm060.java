package com.vt.demo20.entity.db1;

import javax.annotation.Generated;

public class Basm060 {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer custNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String custName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String unifyNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String txCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer mainCustno;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String remk;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getCustNo() {
        return custNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCustNo(Integer custNo) {
        this.custNo = custNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCustName() {
        return custName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getUnifyNo() {
        return unifyNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setUnifyNo(String unifyNo) {
        this.unifyNo = unifyNo == null ? null : unifyNo.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getTxCode() {
        return txCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setTxCode(String txCode) {
        this.txCode = txCode == null ? null : txCode.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getMainCustno() {
        return mainCustno;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setMainCustno(Integer mainCustno) {
        this.mainCustno = mainCustno;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getRemk() {
        return remk;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setRemk(String remk) {
        this.remk = remk == null ? null : remk.trim();
    }
}