package com.entity;

import java.util.Date;

public class Trading_record {
    private String trid;

    private String trtype;

    private Long trmoney;

    private Long trbalance;

    private Date trtime;

    private String iccardnum;

    public String getTrid() {
        return trid;
    }

    public void setTrid(String trid) {
        this.trid = trid == null ? null : trid.trim();
    }

    public String getTrtype() {
        return trtype;
    }

    public void setTrtype(String trtype) {
        this.trtype = trtype == null ? null : trtype.trim();
    }

    public Long getTrmoney() {
        return trmoney;
    }

    public void setTrmoney(Long trmoney) {
        this.trmoney = trmoney;
    }

    public Long getTrbalance() {
        return trbalance;
    }

    public void setTrbalance(Long trbalance) {
        this.trbalance = trbalance;
    }

    public Date getTrtime() {
        return trtime;
    }

    public void setTrtime(Date trtime) {
        this.trtime = trtime;
    }

    public String getIccardnum() {
        return iccardnum;
    }

    public void setIccardnum(String iccardnum) {
        this.iccardnum = iccardnum == null ? null : iccardnum.trim();
    }
}