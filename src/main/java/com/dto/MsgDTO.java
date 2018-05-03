package com.dto;

import java.util.HashMap;
import java.util.Map;

public class MsgDTO {
	public final static Integer STATUS_OK = 0;
	public final static Integer STATUS_ERR = -1;
	public final static Integer STATUS_FORBIDDEN = -2;
	
	public final static String MESSAGE_OK = "操作成功";
	public final static String MESSAGE_ERR = "操作失败";
	
	private Integer status = STATUS_OK;
	
	private String message = "";
	
	private Integer total = 0;
	
	private Map<String, Object> data = new HashMap<String, Object>();
	
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
	//存放数据，支持链式操作
	public MsgDTO add(String key,Object value){
		MsgDTO msgDTO = new MsgDTO();
		data.put(key, value);
		msgDTO.setData(data);
		return msgDTO;  
	}
	
	public MsgDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MsgDTO(Integer status, String message, Integer total,
			Map<String, Object> data) {
		super();
		this.status = status;
		this.message = message;
		this.total = total;
		this.data = data;
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
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
}
