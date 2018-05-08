package com.dto;


public class MsgDTO {
	public final static Integer STATUS_OK = 0;	//成功
	public final static Integer STATUS_ERR = -1;	//失败
	public final static Integer STATUS_Zero = -2;	//获取数据为空
	
	public final static String MESSAGE_OK = "操作成功";
	public final static String MESSAGE_ERR = "操作失败";
	public final static String MESSAGE_Zero = "列表为空";
	
	private Integer status = STATUS_OK;
	
	private String message = "";
	
	private Integer total = 0;
	
	private Object data = null;
	
	//返回成功结果的方法
	public static MsgDTO success(){
		MsgDTO msgDTO = new MsgDTO();
		msgDTO.setStatus(STATUS_OK);
		msgDTO.setMessage(MESSAGE_OK);
		return msgDTO;
	}
	//返回失败结果的方法
	public static MsgDTO fail(){
		MsgDTO msgDTO = new MsgDTO();
		msgDTO.setStatus(STATUS_ERR);
		msgDTO.setMessage(MESSAGE_ERR);
		return msgDTO;
	}
	//返回空结果的方法
	public static MsgDTO zero(){
		MsgDTO msgDTO = new MsgDTO();
		msgDTO.setStatus(STATUS_Zero);
		msgDTO.setMessage(MESSAGE_Zero);
		return msgDTO;
	}
	public MsgDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
