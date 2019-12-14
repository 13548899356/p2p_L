package com.zking.ssm.model;

import lombok.Data;

@Data
public class Product {
    private String id;

    private String title;

    private Integer rangelimit;

    private Integer pdate;

    private String remark;

    private Float interest;


}