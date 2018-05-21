package com.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entity.IcCard;
import com.entity.IcCardExample;
import com.entity.PatientCardVO;
import com.mapper.IcCardMapper;
import com.service.IcCardService;

@Service("icCardService")
public class IcCardServiceImpl implements IcCardService {

	@Resource
	private IcCardMapper icCardMapper;
	
	@Override
	public int creatIcCard(IcCard icCard) {
		int isOk = icCardMapper.insertSelective(icCard);
		return isOk;
	}

	@Override
	public PatientCardVO selectIcCard(String icCardNum) {
		return icCardMapper.selectIcCard(icCardNum);
	}

	@Override
	public int closeAccount(String icCardNum,Date lastTime) {
		IcCard icCard = new IcCard();
		icCard.setIcbalance(0l);
		icCard.setIsstatus("C");
		icCard.setLasttime(lastTime);
		IcCardExample iExam = new IcCardExample();
		iExam.createCriteria().andIccardnumEqualTo(icCardNum);
		int isOk = icCardMapper.updateByExampleSelective(icCard, iExam);
		return isOk;
	}

	@Override
	public int toRecharge(String icCardNum, long icBalance, long trMoney,Date time) {
		IcCardExample iExam = new IcCardExample();
		iExam.createCriteria().andIccardnumEqualTo(icCardNum);
		IcCard icCard = new IcCard();
		icCard.setLasttime(time);
		icCard.setIcbalance(icBalance);
		int isOk = icCardMapper.updateByExampleSelective(icCard, iExam);
		return isOk;
	}

}
