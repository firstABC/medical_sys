package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Drug;
import com.entity.DrugExample;
import com.mapper.DrugMapper;
import com.mysql.jdbc.Util;
import com.service.DrugService;
import com.util.Utils;

@Service("DrugService")
public class DrugServiceImpl implements DrugService{
	
	@SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private DrugMapper drugMapper;
	
	/**
	 * 获取全部列表
	 */
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
	/**
	 * 添加药品
	 */
	@Override
	public int addDrug(Drug drug) throws Exception{
		drug.setDrugid(Utils.getUUID());
		drug.setCreatetime(Utils.getNow());
		int num = 0;
		//插入记录
		num = drugMapper.insert(drug);
		return num;
	}
	/**
	 * 删除药品
	 */
	@Override
	public int deleteDrug(String drugId) throws Exception{
		DrugExample dExam = new DrugExample();
		dExam.createCriteria().andDrugidEqualTo(drugId);
		int num = 0;
		//根据ID删除记录
		num = drugMapper.deleteByExample(dExam);
		return num;
	}
	/**
	 * 修改药品
	 */
	@Override
	public int updateDrug(Drug drug) throws Exception{
		drug.setCreatetime(Utils.getNow());
		DrugExample dExam = new DrugExample();
		dExam.createCriteria().andDrugidEqualTo(drug.getDrugid());
		int num = 0;
		//根据ID修改记录
		num = drugMapper.updateByExample(drug, dExam);
		return num;
	}
	/**
	 * 根据药品ID获取药品信息
	 */
	@Override
	public Drug getDrug(String drugId) throws Exception {
		DrugExample dExam = new DrugExample();
		dExam.createCriteria().andDrugidEqualTo(drugId);
		List<Drug> dList = drugMapper.selectByExample(dExam);
		Drug drug = new Drug();
		if(Utils.listNotNull(dList)){
			if(dList.get(0) != null){
				drug = dList.get(0);
			}
		}
		return drug;
	}
	/**
	 * 多条件模糊查询药品
	 */
	@Override
	public List<Drug> getDrugByCons(String drugName, String drugCode)throws Exception {
		if(Utils.stringNotEmpty(drugName)){
			drugName = "%"+drugName+"%";
		}
		if(Utils.stringNotEmpty(drugCode)){
			drugCode = "%"+drugCode+"%";
		}
		List<Drug> dList = drugMapper.selectByCons(drugName, drugCode);
		if(Utils.listNotNull(dList)){
			return dList;
		}else{
			return new ArrayList<Drug>();
		}
	}

}
