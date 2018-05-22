package com.service;

import java.util.Date;
import java.util.List;

import com.entity.Trading_record;

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
	
	/**
	 * 查询医疗卡消费记录
	 * @param icCardNum
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	public List<Trading_record> selectExpenseRecord(String icCardNum,Date beginTime,Date endTime);

}
