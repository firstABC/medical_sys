package com.dto;

public class PaCaCons {
	
    private String iccardnum;
    
    private String paname;
    
    private String paphone;
    
    private String isstatus;
    
	public PaCaCons() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PaCaCons(String iccardnum, String paname, String paphone,
			String isstatus) {
		super();
		this.iccardnum = iccardnum;
		this.paname = paname;
		this.paphone = paphone;
		this.isstatus = isstatus;
	}

	public String getIccardnum() {
		return iccardnum;
	}

	public void setIccardnum(String iccardnum) {
		this.iccardnum = iccardnum;
	}

	public String getPaname() {
		return paname;
	}

	public void setPaname(String paname) {
		this.paname = paname;
	}

	public String getPaphone() {
		return paphone;
	}

	public void setPaphone(String paphone) {
		this.paphone = paphone;
	}

	public String getIsstatus() {
		return isstatus;
	}

	public void setIsstatus(String isstatus) {
		this.isstatus = isstatus;
	}

	@Override
	public String toString() {
		return "PaCaCons [iccardnum=" + iccardnum + ", paname=" + paname
				+ ", paphone=" + paphone + ", isstatus=" + isstatus + "]";
	}
    
}
