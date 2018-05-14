package com.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.entity.IcCard;
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

}
