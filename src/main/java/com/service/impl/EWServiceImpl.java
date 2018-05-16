package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.entity.Drug;
import com.entity.DrugExample;
import com.entity.Earlywarning;
import com.entity.EarlywarningExample;
import com.mapper.DrugMapper;
import com.mapper.EarlywarningMapper;
import com.service.DrugService;
import com.service.EWService;
import com.util.Utils;

@Service("ewService")
public class EWServiceImpl implements EWService{
	
	@SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private EarlywarningMapper ewMapper;
	
	
	/**
	 * 修改预警
	 */
	@Override
	public int updateEW(Earlywarning warning) throws Exception{
		EarlywarningExample eExam = new EarlywarningExample();
		eExam.createCriteria().andIdEqualTo(warning.getId());
		int num = 0;
		//根据ID修改记录
		num = ewMapper.updateByExample(warning, eExam);
		return num;
	}
	/**
	 * 获取预警数量
	 */
	@Override
	public Earlywarning getEW() throws Exception {
		EarlywarningExample eExam = new EarlywarningExample();
		List<Earlywarning> eList = ewMapper.selectByExample(eExam);
		Earlywarning warning = new Earlywarning();
		if(Utils.listNotNull(eList)){
			if(eList.get(0) != null){
				warning = eList.get(0);
			}
		}
		return warning;
	}
}
