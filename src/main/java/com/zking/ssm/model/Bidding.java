package com.zking.ssm.model;

import lombok.ToString;

@ToString
public class Bidding {
    private String id;

    private String uid;

    private Integer state;

    //借款对象表
    private Borrowmoney borrowmoney;

    //用户表
    private sysUser sysUser;

    public sysUser getSysUser(){
        return sysUser;
    }

    public void setSysUser(sysUser sysUser) {
        this.sysUser = sysUser;
    }

    public Borrowmoney getBorrowmoney() {
        return borrowmoney;
    }

    public void setBorrowmoney(Borrowmoney borrowmoney) {
        this.borrowmoney = borrowmoney;
    }

    public Bidding(String id, String uid, Integer state) {
        this.id = id;
        this.uid = uid;
        this.state = state;
    }

    public Bidding() {
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

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}