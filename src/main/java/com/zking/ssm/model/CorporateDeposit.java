package com.zking.ssm.model;

import lombok.ToString;

import java.math.BigDecimal;

@ToString
public class CorporateDeposit {
    private String id;

    private BigDecimal getmoney;

    private String pid;

    private BigDecimal capital;

    //减钱数据没有的
    private int rangelimit;

    public int getRangelimit() {
        return rangelimit;
    }

    public void setRangelimit(int rangelimit) {
        this.rangelimit = rangelimit;
    }

    public CorporateDeposit(String id, BigDecimal getmoney, String pid, BigDecimal capital) {
        this.id = id;
        this.getmoney = getmoney;
        this.pid = pid;
        this.capital = capital;
    }

    public CorporateDeposit() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getGetmoney() {
        return getmoney;
    }

    public void setGetmoney(BigDecimal getmoney) {
        this.getmoney = getmoney;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }
}