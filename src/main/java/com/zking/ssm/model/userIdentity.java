package com.zking.ssm.model;

import lombok.ToString;

@ToString
public class userIdentity {
    private String id;

    private String uid;

    private String phone;

    private String email;

    private String identity;

    private Integer pay;

    public userIdentity(String id, String uid, String phone, String email, String identity, Integer pay) {
        this.id = id;
        this.uid = uid;
        this.phone = phone;
        this.email = email;
        this.identity = identity;
        this.pay = pay;
    }

    public userIdentity() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Integer getPay() {
        return pay;
    }

    public void setPay(Integer pay) {
        this.pay = pay;
    }
}