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

}
