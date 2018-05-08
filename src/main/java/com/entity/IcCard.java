package com.entity;

public class IcCard {
    private String icid;

    private String iccardnum;

    private Long icbalance;

    private String isstatus;

    public String getIcid() {
        return icid;
    }

    public void setIcid(String icid) {
        this.icid = icid == null ? null : icid.trim();
    }

    public String getIccardnum() {
        return iccardnum;
    }

    public void setIccardnum(String iccardnum) {
        this.iccardnum = iccardnum == null ? null : iccardnum.trim();
    }

    public Long getIcbalance() {
        return icbalance;
    }

    public void setIcbalance(Long icbalance) {
        this.icbalance = icbalance;
    }

    public String getIsstatus() {
        return isstatus;
    }

    public void setIsstatus(String isstatus) {
        this.isstatus = isstatus == null ? null : isstatus.trim();
    }
}