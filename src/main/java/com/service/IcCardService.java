package com.service;

import java.util.Date;

import com.entity.IcCard;
import com.entity.PatientCardVO;

public interface IcCardService {
	
	/**
	 * 开户
	 * @param icCard
	 * @return
	 */
	public int creatIcCard(IcCard icCard);
	
	/**
	 * 销户--查询卡基本信息
	 * @param icCardNum
	 * @return
	 */
	public PatientCardVO selectIcCard(String icCardNum);
	/**
	 * 根据卡号进行销户
	 * @param icCardNum
	 * @return
	 */
	public int closeAccount(String icCardNum,Date lastTime);

}
