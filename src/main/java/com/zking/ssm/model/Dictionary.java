package com.zking.ssm.model;

import lombok.ToString;

@ToString
public class Dictionary {
    private String id;

    private String dicttype;

    private String dictitem;

    private String dictvalue;

    private Integer dictiseditable;

    public Dictionary(String id, String dicttype, String dictitem, String dictvalue, Integer dictiseditable) {
        this.id = id;
        this.dicttype = dicttype;
        this.dictitem = dictitem;
        this.dictvalue = dictvalue;
        this.dictiseditable = dictiseditable;
    }

    public Dictionary() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDicttype() {
        return dicttype;
    }

    public void setDicttype(String dicttype) {
        this.dicttype = dicttype;
    }

    public String getDictitem() {
        return dictitem;
    }

    public void setDictitem(String dictitem) {
        this.dictitem = dictitem;
    }

    public String getDictvalue() {
        return dictvalue;
    }

    public void setDictvalue(String dictvalue) {
        this.dictvalue = dictvalue;
    }

    public Integer getDictiseditable() {
        return dictiseditable;
    }

    public void setDictiseditable(Integer dictiseditable) {
        this.dictiseditable = dictiseditable;
    }
}