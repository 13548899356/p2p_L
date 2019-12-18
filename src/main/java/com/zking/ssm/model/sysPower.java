package com.zking.ssm.model;

import lombok.Data;

import java.util.Date;

@Data
public class sysPower {
    private String pid;

    private String nikename;

    private String pname;

    private String password;

    private Date createdate;

    private Integer locked;


}