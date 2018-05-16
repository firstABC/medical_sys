package com.entity;

public class Earlywarning {
    private String id;

    private Integer minnum;
    
    public Earlywarning() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Earlywarning(String id, Integer minnum) {
		super();
		this.id = id;
		this.minnum = minnum;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getMinnum() {
        return minnum;
    }

    public void setMinnum(Integer minnum) {
        this.minnum = minnum;
    }

	@Override
	public String toString() {
		return "Earlywarning [id=" + id + ", minnum=" + minnum + "]";
	}
}