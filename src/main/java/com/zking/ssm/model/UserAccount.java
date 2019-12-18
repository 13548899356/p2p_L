package com.zking.ssm.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;

@ToString
public class UserAccount {
    private String id;

    private String uid;

    private String photo;

    private String tradepassword;

    private BigDecimal usableamount;

    private BigDecimal freezedamount;

    private BigDecimal unreceiveinterest;

    private BigDecimal unreceiveprincipal;

    private BigDecimal unreturnamount;

    private BigDecimal remainborrowlimit;

    private BigDecimal borrowlimit;

    private String remark;

    private MultipartFile imgName;

    public MultipartFile getImgName() {
        return imgName;
    }

    public void setImgName(MultipartFile imgName) {
        this.imgName = imgName;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getTradepassword() {
        return tradepassword;
    }

    public void setTradepassword(String tradepassword) {
        this.tradepassword = tradepassword;
    }

    public BigDecimal getUsableamount() {
        return usableamount;
    }

    public void setUsableamount(BigDecimal usableamount) {
        this.usableamount = usableamount;
    }

    public BigDecimal getFreezedamount() {
        return freezedamount;
    }

    public void setFreezedamount(BigDecimal freezedamount) {
        this.freezedamount = freezedamount;
    }

    public BigDecimal getUnreceiveinterest() {
        return unreceiveinterest;
    }

    public void setUnreceiveinterest(BigDecimal unreceiveinterest) {
        this.unreceiveinterest = unreceiveinterest;
    }

    public BigDecimal getUnreceiveprincipal() {
        return unreceiveprincipal;
    }

    public void setUnreceiveprincipal(BigDecimal unreceiveprincipal) {
        this.unreceiveprincipal = unreceiveprincipal;
    }

    public BigDecimal getUnreturnamount() {
        return unreturnamount;
    }

    public void setUnreturnamount(BigDecimal unreturnamount) {
        this.unreturnamount = unreturnamount;
    }

    public BigDecimal getRemainborrowlimit() {
        return remainborrowlimit;
    }

    public void setRemainborrowlimit(BigDecimal remainborrowlimit) {
        this.remainborrowlimit = remainborrowlimit;
    }

    public BigDecimal getBorrowlimit() {
        return borrowlimit;
    }

    public void setBorrowlimit(BigDecimal borrowlimit) {
        this.borrowlimit = borrowlimit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public UserAccount() {

    }

    public UserAccount(String id, String uid, String photo, String tradepassword, BigDecimal usableamount, BigDecimal freezedamount, BigDecimal unreceiveinterest, BigDecimal unreceiveprincipal, BigDecimal unreturnamount, BigDecimal remainborrowlimit, BigDecimal borrowlimit, String remark) {
        this.id = id;
        this.uid = uid;
        this.photo = photo;
        this.tradepassword = tradepassword;
        this.usableamount = usableamount;
        this.freezedamount = freezedamount;
        this.unreceiveinterest = unreceiveinterest;
        this.unreceiveprincipal = unreceiveprincipal;
        this.unreturnamount = unreturnamount;
        this.remainborrowlimit = remainborrowlimit;
        this.borrowlimit = borrowlimit;
        this.remark = remark;
    }
}