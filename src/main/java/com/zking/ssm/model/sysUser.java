package com.zking.ssm.model;

import lombok.ToString;

import java.util.Date;
@ToString
public class sysUser {
    private String uid;

    private String uname;

    private String password;

    private String salt;

    private Date createdate;

    private Integer locked;

    public sysUser(String uid, String uname, String password, String salt, Date createdate, Integer locked) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.salt = salt;
        this.createdate = createdate;
        this.locked = locked;
    }

    public sysUser() {
        super();
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }
}