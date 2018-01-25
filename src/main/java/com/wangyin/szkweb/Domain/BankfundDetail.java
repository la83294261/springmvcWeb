package com.wangyin.szkweb.Domain;

import java.util.Date;

public class BankfundDetail {
    private Long id;
    private  String tesStr;
    private Integer financetype;

    private String tobankid;

    private String transdate;

    private String transtype;

    private String accountno;

    private Long amount;

    private String involaccount;

    private String involname;

    private String biztype;

    private String remark;

    private String merchantno;

    private String equaldate;

    private Byte reconstatus;

    private Date createdDate;

    private Date modifiedDate;

    private String sideremark;

    private String summary;

    private String info;

    private String uses;

    private String operator;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFinancetype() {
        return financetype;
    }

    public void setFinancetype(Integer financetype) {
        this.financetype = financetype;
    }

    public String getTobankid() {
        return tobankid;
    }

    public void setTobankid(String tobankid) {
        this.tobankid = tobankid == null ? null : tobankid.trim();
    }

    public String getTransdate() {
        return transdate;
    }

    public void setTransdate(String transdate) {
        this.transdate = transdate == null ? null : transdate.trim();
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype == null ? null : transtype.trim();
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno == null ? null : accountno.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getInvolaccount() {
        return involaccount;
    }

    public void setInvolaccount(String involaccount) {
        this.involaccount = involaccount == null ? null : involaccount.trim();
    }

    public String getInvolname() {
        return involname;
    }

    public void setInvolname(String involname) {
        this.involname = involname == null ? null : involname.trim();
    }

    public String getBiztype() {
        return biztype;
    }

    public void setBiztype(String biztype) {
        this.biztype = biztype == null ? null : biztype.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMerchantno() {
        return merchantno;
    }

    public void setMerchantno(String merchantno) {
        this.merchantno = merchantno == null ? null : merchantno.trim();
    }

    public String getEqualdate() {
        return equaldate;
    }

    public void setEqualdate(String equaldate) {
        this.equaldate = equaldate == null ? null : equaldate.trim();
    }

    public Byte getReconstatus() {
        return reconstatus;
    }

    public void setReconstatus(Byte reconstatus) {
        this.reconstatus = reconstatus;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getSideremark() {
        return sideremark;
    }

    public void setSideremark(String sideremark) {
        this.sideremark = sideremark == null ? null : sideremark.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    public String getUses() {
        return uses;
    }

    public void setUses(String uses) {
        this.uses = uses == null ? null : uses.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }
}