package com.entity;

import java.math.BigDecimal;

public class PrescriptionDrug {
    private String id;

    private String prescriptionid;

    private String drugcode;

    private String drugname;

    private Integer drugnum;

    private BigDecimal drugprice;

    private String drugunit;

    private String usagetext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPrescriptionid() {
        return prescriptionid;
    }

    public void setPrescriptionid(String prescriptionid) {
        this.prescriptionid = prescriptionid == null ? null : prescriptionid.trim();
    }

    public String getDrugcode() {
        return drugcode;
    }

    public void setDrugcode(String drugcode) {
        this.drugcode = drugcode == null ? null : drugcode.trim();
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

    public BigDecimal getDrugprice() {
        return drugprice;
    }

    public void setDrugprice(BigDecimal drugprice) {
        this.drugprice = drugprice;
    }

    public String getDrugunit() {
        return drugunit;
    }

    public void setDrugunit(String drugunit) {
        this.drugunit = drugunit == null ? null : drugunit.trim();
    }

    public String getUsagetext() {
        return usagetext;
    }

    public void setUsagetext(String usagetext) {
        this.usagetext = usagetext == null ? null : usagetext.trim();
    }

	@Override
	public String toString() {
		return "PrescriptionDrug [id=" + id + ", prescriptionid="
				+ prescriptionid + ", drugcode=" + drugcode + ", drugname="
				+ drugname + ", drugnum=" + drugnum + ", drugprice="
				+ drugprice + ", drugunit=" + drugunit + ", usagetext="
				+ usagetext + "]";
	}
}