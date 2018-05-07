package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Drug;
import com.entity.DrugExample;
import com.mapper.DrugMapper;
import com.service.DrugService;
import com.util.Utils;

@Service("DrugService")
public class DrugServiceImpl implements DrugService{
	
	@SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private DrugMapper drugMapper;
	
	@Override
	public List<Drug> getDrugList() throws Exception{
		DrugExample dExam = new DrugExample();
		//获取List
		List<Drug> dList = drugMapper.selectByExample(dExam);
		if(Utils.listNotNull(dList)){
			return dList;
		}else{
			return new ArrayList<Drug>();
		}
		
	}

	@Override
	public int addDrug(Drug drug) throws Exception{
		drug.setDrugid(Utils.getUUID());
		int num = 0;
		//插入记录
		num = drugMapper.insert(drug);
		return num;
	}

	@Override
	public int deleteDrug(String drugId) throws Exception{
		DrugExample dExam = new DrugExample();
		dExam.createCriteria().andDrugidEqualTo(drugId);
		int num = 0;
		//根据ID删除记录
		num = drugMapper.deleteByExample(dExam);
		return num;
	}

	@Override
	public int updateDrug(Drug drug) throws Exception{
		DrugExample dExam = new DrugExample();
		dExam.createCriteria().andDrugidEqualTo(drug.getDrugid());
		int num = 0;
		//根据ID修改记录
		num = drugMapper.updateByExample(drug, dExam);
		return 0;
	}

}
