package com.service;

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

}
