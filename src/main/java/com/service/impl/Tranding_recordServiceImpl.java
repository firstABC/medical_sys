package com.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Trading_record;
import com.mapper.Trading_recordMapper;
import com.service.Tranding_recordService;
import com.util.Utils;
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
	@Override
	public int toReCharge(String icCardNum, long icBalance, long trMoney, Date time) {
		Trading_record record = new Trading_record();
		record.setTrid(Utils.getUUID());
		record.setTrtype("A");
		record.setTrbalance(icBalance);
		record.setTrmoney(trMoney);
		record.setTrtime(time);
		record.setIccardnum(icCardNum);
		int isOk = tranding_recordMapper.insert(record);
		return isOk;
	}
	@Override
	public List<Trading_record> selectExpenseRecord(String icCardNum, Date beginTime, Date endTime) {
		List<Trading_record> ltExpenseRecord = tranding_recordMapper.selectExpenseRecord(icCardNum, beginTime, endTime);
		return ltExpenseRecord;
	}

}
