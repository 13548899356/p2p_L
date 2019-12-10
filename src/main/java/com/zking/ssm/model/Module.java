package com.zking.ssm.model;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class Module {
    private Integer id;

    private Integer pid;

    private String text;

    private String icon;

    private String url;

    private Integer sort;

    private List<Module> children=new ArrayList<>();

    public Module(Integer id, Integer pid, String text, String icon, String url, Integer sort) {
        this.id = id;
        this.pid = pid;
        this.text = text;
        this.icon = icon;
        this.url = url;
        this.sort = sort;
    }

    public Module() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public List<Module> getChildren() {
        return children;
    }

    public void setChildren(List<Module> children) {
        this.children = children;
    }
}