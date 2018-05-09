package com.entity;

import java.util.Date;

public class MedicalRecord {
    private String id;

    private String iccardnum;

    private String paname;

    private String pasex;

    private String paage;

    private String selfReported;

    private String nowMedicalRecord;

    private String diagnosis;

    private String remark;

    private String physician;

    private Date createtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getPaage() {
        return paage;
    }

    public void setPaage(String paage) {
        this.paage = paage == null ? null : paage.trim();
    }

    public String getSelfReported() {
        return selfReported;
    }

    public void setSelfReported(String selfReported) {
        this.selfReported = selfReported == null ? null : selfReported.trim();
    }

    public String getNowMedicalRecord() {
        return nowMedicalRecord;
    }

    public void setNowMedicalRecord(String nowMedicalRecord) {
        this.nowMedicalRecord = nowMedicalRecord == null ? null : nowMedicalRecord.trim();
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis == null ? null : diagnosis.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPhysician() {
        return physician;
    }

    public void setPhysician(String physician) {
        this.physician = physician == null ? null : physician.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

	@Override
	public String toString() {
		return "MedicalRecord [id=" + id + ", iccardnum=" + iccardnum
				+ ", paname=" + paname + ", pasex=" + pasex + ", paage="
				+ paage + ", selfReported=" + selfReported
				+ ", nowMedicalRecord=" + nowMedicalRecord + ", diagnosis="
				+ diagnosis + ", remark=" + remark + ", physician=" + physician
				+ ", createtime=" + createtime + "]";
	}
}