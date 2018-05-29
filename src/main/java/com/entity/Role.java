package com.entity;

import java.util.List;

public class Role {
    private String roleid;

    private String rolenmae;

    private List<String> ltPerCode;
    
    
    public List<String> getLtPerCode() {
		return ltPerCode;
	}

	public void setLtPerCode(List<String> ltPerCode) {
		this.ltPerCode = ltPerCode;
	}

	public Role() {
		super();
	}

	public Role(String roleid, String rolenmae) {
		super();
		this.roleid = roleid;
		this.rolenmae = rolenmae;
	}

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