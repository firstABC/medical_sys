package com.service;

import java.util.Date;

public interface Tranding_recordService {
	/**
	 * 销户
	 * @param icCardNum
	 * @param trMoney
	 * @return
	 */
	public int closeAccount(String icCardNum,Long trMoney,Date time);
	
	/**
	 * 医疗卡充值
	 * @param icCardNum
	 * @param icBalance
	 * @param trMoney
	 * @param time
	 * @return
	 */
	public int toReCharge(String icCardNum, long icBalance, long trMoney,Date time);

}
