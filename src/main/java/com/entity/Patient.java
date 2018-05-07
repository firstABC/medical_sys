package com.entity;

public class Patient {
    private String patientid;

    private String paname;

    private String paidcard;

    private String paphone;

    private String paage;

    private String pasex;

    private String pamarriage;

    private String paaddress;

    private String pacreator;

    private String icid;

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid == null ? null : patientid.trim();
    }

    public String getPaname() {
        return paname;
    }

    public void setPaname(String paname) {
        this.paname = paname == null ? null : paname.trim();
    }

    public String getPaidcard() {
        return paidcard;
    }

    public void setPaidcard(String paidcard) {
        this.paidcard = paidcard == null ? null : paidcard.trim();
    }

    public String getPaphone() {
        return paphone;
    }

    public void setPaphone(String paphone) {
        this.paphone = paphone == null ? null : paphone.trim();
    }

    public String getPaage() {
        return paage;
    }

    public void setPaage(String paage) {
        this.paage = paage == null ? null : paage.trim();
    }

    public String getPasex() {
        return pasex;
    }

    public void setPasex(String pasex) {
        this.pasex = pasex == null ? null : pasex.trim();
    }

    public String getPamarriage() {
        return pamarriage;
    }

    public void setPamarriage(String pamarriage) {
        this.pamarriage = pamarriage == null ? null : pamarriage.trim();
    }

    public String getPaaddress() {
        return paaddress;
    }

    public void setPaaddress(String paaddress) {
        this.paaddress = paaddress == null ? null : paaddress.trim();
    }

    public String getPacreator() {
        return pacreator;
    }

    public void setPacreator(String pacreator) {
        this.pacreator = pacreator == null ? null : pacreator.trim();
    }

    public String getIcid() {
        return icid;
    }

    public void setIcid(String icid) {
        this.icid = icid == null ? null : icid.trim();
    }
}