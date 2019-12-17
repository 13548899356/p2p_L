package com.zking.ssm.model;

import lombok.ToString;

@ToString
public class Loan {
    private String id;

    private String uid;

    private String pid;

    private Integer state;

    private Integer type;


    //多表联查
    private sysUser sysUser;
    private Product product;


    public com.zking.ssm.model.sysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(com.zking.ssm.model.sysUser sysUser) {
        this.sysUser = sysUser;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Loan(String id, String uid, String pid, Integer state, Integer type) {
        this.id = id;
        this.uid = uid;
        this.pid = pid;
        this.state = state;
        this.type = type;
    }

    public Loan() {
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

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}