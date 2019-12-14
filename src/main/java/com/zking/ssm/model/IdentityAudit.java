package com.zking.ssm.model;

import lombok.ToString;

@ToString
public class IdentityAudit {
    private String id;

    private String uid;

    private String uname;

    private String usex;

    private String identity;

    private String image1;

    private String image2;

    private String message;

    private Integer state;

    public IdentityAudit(String id, String uid, String uname, String usex, String identity, String image1, String image2, String message, Integer state) {
        this.id = id;
        this.uid = uid;
        this.uname = uname;
        this.usex = usex;
        this.identity = identity;
        this.image1 = image1;
        this.image2 = image2;
        this.message = message;
        this.state = state;
    }

    public IdentityAudit() {
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

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}