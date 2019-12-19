package com.zking.ssm.model;

import lombok.ToString;

@ToString
public class SysPowerRole {
    private String powerid;

    private String roleid;

    public SysPowerRole(String powerid, String roleid) {
        this.powerid = powerid;
        this.roleid = roleid;
    }

    public SysPowerRole() {
        super();
    }

    public String getPowerid() {
        return powerid;
    }

    public void setPowerid(String powerid) {
        this.powerid = powerid;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }
}