package com.entity;

import java.util.Date;

public class Prescription {
    private String prscriptionid;

    private String iccardnum;

    private String paname;

    private String pasex;

    private Integer paage;

    private Date createtime;

    private String druggist;

    private String physician;

    private Long drugprice;

    private String registrationcode;

    private String prescriptioncode;

    private String payee;

    private String status;

    private Date lasttime;

    public String getPrscriptionid() {
        return prscriptionid;
    }

    public void setPrscriptionid(String prscriptionid) {
        this.prscriptionid = prscriptionid == null ? null : prscriptionid.trim();
    }

    public String getIccardnum() {
        return iccardnum;
    }

    public void setIccardnum(String iccardnum) {
        this.iccardnum = iccardnum == null ? null : iccardnum.trim();
    }

    public String getPaname() {
        return paname;
    }

    public void setPaname(String paname) {
        this.paname = paname == null ? null : paname.trim();
    }

    public String getPasex() {
        return pasex;
    }

    public void setPasex(String pasex) {
        this.pasex = pasex == null ? null : pasex.trim();
    }

    public Integer getPaage() {
        return paage;
    }

    public void setPaage(Integer paage) {
        this.paage = paage;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDruggist() {
        return druggist;
    }

    public void setDruggist(String druggist) {
        this.druggist = druggist == null ? null : druggist.trim();
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician == null ? null : physician.trim();
    }

    public Long getDrugprice() {
        return drugprice;
    }

    public void setDrugprice(Long drugprice) {
        this.drugprice = drugprice;
    }

    public String getRegistrationcode() {
        return registrationcode;
    }

    public void setRegistrationcode(String registrationcode) {
        this.registrationcode = registrationcode == null ? null : registrationcode.trim();
    }

    public String getPrescriptioncode() {
        return prescriptioncode;
    }

    public void setPrescriptioncode(String prescriptioncode) {
        this.prescriptioncode = prescriptioncode == null ? null : prescriptioncode.trim();
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getLasttime() {
        return lasttime;
    }

    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }
}