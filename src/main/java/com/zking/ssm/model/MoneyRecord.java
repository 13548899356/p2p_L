package com.zking.ssm.model;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@ToString
public class MoneyRecord {
    private String id;

    private String uid;

    private Date mrdate;

    private String mrtype;

    private BigDecimal mrmoney;

    private BigDecimal usableamount;

    private BigDecimal freezedamount;

    private Integer installment;

    private Integer repayment;

    private String repaydate;

    private Integer state;

    private String mrremark;

    public MoneyRecord(String id, String uid, Date mrdate, String mrtype, BigDecimal mrmoney, BigDecimal usableamount, BigDecimal freezedamount, Integer installment, Integer repayment, Date repaydate, Integer state, String mrremark) {
        this.id = id;
        this.uid = uid;
        this.mrdate = mrdate;
        this.mrtype = mrtype;
        this.mrmoney = mrmoney;
        this.usableamount = usableamount;
        this.freezedamount = freezedamount;
        this.installment = installment;
        this.repayment = repayment;
        this.state = state;
        this.mrremark = mrremark;
    }

    public MoneyRecord() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Date getMrdate() {
        return mrdate;
    }

    public void setMrdate(Date mrdate) {
        this.mrdate = mrdate;
    }

    public String getMrtype() {
        return mrtype;
    }

    public void setMrtype(String mrtype) {
        this.mrtype = mrtype;
    }

    public BigDecimal getMrmoney() {
        return mrmoney;
    }

    public void setMrmoney(BigDecimal mrmoney) {
        this.mrmoney = mrmoney;
    }

    public BigDecimal getUsableamount() {
        return usableamount;
    }

    public void setUsableamount(BigDecimal usableamount) {
        this.usableamount = usableamount;
    }

    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }

    public Integer getInstallment() {
        return installment;
    }

    public void setInstallment(Integer installment) {
        this.installment = installment;
    }

    public Integer getRepayment() {
        return repayment;
    }

    public void setRepayment(Integer repayment) {
        this.repayment = repayment;
    }

    public String getRepaydate() {
        return repaydate;
    }

    public void setRepaydate(String repaydate) {
        this.repaydate = repaydate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMrremark() {
        return mrremark;
    }

    public void setMrremark(String mrremark) {
        this.mrremark = mrremark;
    }
}