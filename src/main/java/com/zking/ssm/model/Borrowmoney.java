package com.zking.ssm.model;

import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
@ToString
public class Borrowmoney {
    private String id;

    private String uid;

    private String returntype;

    private Integer bidrequesttype;

    private Integer bidrequeststate;

    private BigDecimal bidrequestamount;

    private BigDecimal currentrate;

    private BigDecimal minbidamount;

    private Date monthes2return;

    private Integer bidcount;

    private BigDecimal totalrewardamount;

    private BigDecimal currentsum;

    private String title;

    private String description;

    private String note;

    private Date disabledate;

    private Integer disabledays;

    private Date applytime;

    private Date publishtime;

    public Borrowmoney(String id, String uid, String returntype, Integer bidrequesttype, Integer bidrequeststate, BigDecimal bidrequestamount, BigDecimal currentrate, BigDecimal minbidamount, Date monthes2return, Integer bidcount, BigDecimal totalrewardamount, BigDecimal currentsum, String title, String description, String note, Date disabledate, Integer disabledays, Date applytime, Date publishtime) {
        this.id = id;
        this.uid = uid;
        this.returntype = returntype;
        this.bidrequesttype = bidrequesttype;
        this.bidrequeststate = bidrequeststate;
        this.bidrequestamount = bidrequestamount;
        this.currentrate = currentrate;
        this.minbidamount = minbidamount;
        this.monthes2return = monthes2return;
        this.bidcount = bidcount;
        this.totalrewardamount = totalrewardamount;
        this.currentsum = currentsum;
        this.title = title;
        this.description = description;
        this.note = note;
        this.disabledate = disabledate;
        this.disabledays = disabledays;
        this.applytime = applytime;
        this.publishtime = publishtime;
    }

    public Borrowmoney() {
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

    public String getReturntype() {
        return returntype;
    }

    public void setReturntype(String returntype) {
        this.returntype = returntype;
    }

    public Integer getBidrequesttype() {
        return bidrequesttype;
    }

    public void setBidrequesttype(Integer bidrequesttype) {
        this.bidrequesttype = bidrequesttype;
    }

    public Integer getBidrequeststate() {
        return bidrequeststate;
    }

    public void setBidrequeststate(Integer bidrequeststate) {
        this.bidrequeststate = bidrequeststate;
    }

    public BigDecimal getBidrequestamount() {
        return bidrequestamount;
    }

    public void setBidrequestamount(BigDecimal bidrequestamount) {
        this.bidrequestamount = bidrequestamount;
    }

    public BigDecimal getCurrentrate() {
        return currentrate;
    }

    public void setCurrentrate(BigDecimal currentrate) {
        this.currentrate = currentrate;
    }

    public BigDecimal getMinbidamount() {
        return minbidamount;
    }

    public void setMinbidamount(BigDecimal minbidamount) {
        this.minbidamount = minbidamount;
    }

    public Date getMonthes2return() {
        return monthes2return;
    }

    public void setMonthes2return(Date monthes2return) {
        this.monthes2return = monthes2return;
    }

    public Integer getBidcount() {
        return bidcount;
    }

    public void setBidcount(Integer bidcount) {
        this.bidcount = bidcount;
    }

    public BigDecimal getTotalrewardamount() {
        return totalrewardamount;
    }

    public void setTotalrewardamount(BigDecimal totalrewardamount) {
        this.totalrewardamount = totalrewardamount;
    }

    public BigDecimal getCurrentsum() {
        return currentsum;
    }

    public void setCurrentsum(BigDecimal currentsum) {
        this.currentsum = currentsum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDisabledate() {
        return disabledate;
    }

    public void setDisabledate(Date disabledate) {
        this.disabledate = disabledate;
    }

    public Integer getDisabledays() {
        return disabledays;
    }

    public void setDisabledays(Integer disabledays) {
        this.disabledays = disabledays;
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }
}