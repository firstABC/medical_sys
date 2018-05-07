package com.entity;

public class Permissions {
    private String perid;

    private String pername;

    private String percode;

    public String getPerid() {
        return perid;
    }

    public void setPerid(String perid) {
        this.perid = perid == null ? null : perid.trim();
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername == null ? null : pername.trim();
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
    }
}