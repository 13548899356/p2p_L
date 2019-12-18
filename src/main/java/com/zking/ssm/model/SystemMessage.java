package com.zking.ssm.model;

import lombok.ToString;

import java.util.Date;

@ToString
public class SystemMessage {
    private String id;

    private String uid;

    private String content;

    private String title;

    private Date releasetime;

    public SystemMessage(String id, String uid, String content, String title, Date releasetime) {
        this.id = id;
        this.uid = uid;
        this.content = content;
        this.title = title;
        this.releasetime = releasetime;
    }

    public SystemMessage() {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleasetime() {
        return releasetime;
    }

    public void setReleasetime(Date releasetime) {
        this.releasetime = releasetime;
    }
}