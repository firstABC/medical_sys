package com.entity;

import java.util.Date;

public class Drug {
    private String drugid;

    private String drugname;

    private Integer drugnum;

    private Long drugprice;

    private String drugunit;

    private String drugremark;

    private String drugcode;

    private Date createtime;

    public String getDrugid() {
        return drugid;
    }

    public void setDrugid(String drugid) {
        this.drugid = drugid == null ? null : drugid.trim();
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname == null ? null : drugname.trim();
    }

    public Integer getDrugnum() {
        return drugnum;
    }

    public void setDrugnum(Integer drugnum) {
        this.drugnum = drugnum;
    }

    public Long getDrugprice() {
        return drugprice;
    }

    public void setDrugprice(Long drugprice) {
        this.drugprice = drugprice;
    }

    public String getDrugunit() {
        return drugunit;
    }

    public void setDrugunit(String drugunit) {
        this.drugunit = drugunit == null ? null : drugunit.trim();
    }

    public String getDrugremark() {
        return drugremark;
    }

    public void setDrugremark(String drugremark) {
        this.drugremark = drugremark == null ? null : drugremark.trim();
    }

    public String getDrugcode() {
        return drugcode;
    }

    public void setDrugcode(String drugcode) {
        this.drugcode = drugcode == null ? null : drugcode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}