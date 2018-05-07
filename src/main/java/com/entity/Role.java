package com.entity;

public class Role {
    private String roleid;

    private String rolenmae;

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getRolenmae() {
        return rolenmae;
    }

    public void setRolenmae(String rolenmae) {
        this.rolenmae = rolenmae == null ? null : rolenmae.trim();
    }
}