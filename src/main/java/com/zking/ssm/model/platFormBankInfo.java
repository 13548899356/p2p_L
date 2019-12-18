package com.zking.ssm.model;

import lombok.ToString;

import java.math.BigDecimal;

@ToString
public class platFormBankInfo {
    private String id;

    private String uid;

    private String bankname;

    private String accountname;

    private String idcard;

    private BigDecimal balance;

    private String phonenumber;

    private String identity;

    public platFormBankInfo(String id, String uid, String bankname, String accountname, String idcard, BigDecimal balance, String phonenumber) {
        this.id = id;
        this.uid = uid;
        this.bankname = bankname;
        this.accountname = accountname;
        this.idcard = idcard;
        this.balance = balance;
        this.phonenumber = phonenumber;
    }

    public platFormBankInfo() {
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

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}