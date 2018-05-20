package com.service.impl;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Trading_record;
import com.entity.Trading_recordExample;
import com.mapper.Trading_recordMapper;
import com.service.Tranding_recordService;
@Service("tranding_recordService")
public class Tranding_recordServiceImpl implements Tranding_recordService{

	@Autowired
	private Trading_recordMapper tranding_recordMapper;
	@Override
	public int closeAccount(String icCardNum, Long trMoney,Date time) {
		Trading_record trading_record = new Trading_record();
		String trId =  UUID.randomUUID().toString();
		trading_record.setTrid(trId);
		trading_record.setTrtime(time);
		trading_record.setTrmoney(trMoney);
		trading_record.setTrtype("B");
		trading_record.setTrbalance(0l);
		trading_record.setIccardnum(icCardNum);
		int isOk = tranding_recordMapper.insert(trading_record);
		return isOk;
	}

}
