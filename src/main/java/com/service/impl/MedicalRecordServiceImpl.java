package com.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.MedicalRecord;
import com.entity.MedicalRecordExample;
import com.mapper.MedicalRecordMapper;
import com.service.MedicalRecordService;
import com.util.Utils;

@Service("medicalRecordService")
public class MedicalRecordServiceImpl implements MedicalRecordService{
	
	@SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private MedicalRecordMapper medicalRecordMapper;

	@Override
	public List<MedicalRecord> getMeReList() throws Exception{
		MedicalRecordExample meExam = new MedicalRecordExample();
		meExam.setOrderByClause("createtime desc");  
		List<MedicalRecord> meList = medicalRecordMapper.selectByExample(meExam);
		if(Utils.listNotNull(meList)){
			return meList;
		}else{
			return new ArrayList<MedicalRecord>();
		}
	}
	@Override
	public List<MedicalRecord> getMeReListByCons(String icCardNum) throws Exception{
		MedicalRecordExample meExam = new MedicalRecordExample();
		meExam.createCriteria().andIccardnumEqualTo(icCardNum);
		meExam.setOrderByClause("createtime desc");  
		List<MedicalRecord> meList = medicalRecordMapper.selectByExample(meExam);
		if(Utils.listNotNull(meList)){
			return meList;
		}else{
			return new ArrayList<MedicalRecord>();
		}
	}
	@Override
	public MedicalRecord addMeRe(MedicalRecord meRe) throws ParseException {
		meRe.setId(Utils.getUUID());
		meRe.setCreatetime(Utils.getNow());
		//添加
		medicalRecordMapper.insert(meRe);
		return meRe;
	}
	@Override
	public MedicalRecord updateMeRe(MedicalRecord meRe) throws ParseException {
		meRe.setCreatetime(Utils.getNow());
		MedicalRecordExample meExam = new MedicalRecordExample();
		meExam.createCriteria().andIdEqualTo(meRe.getId());
		//根据ID修改记录
		medicalRecordMapper.updateByExample(meRe, meExam);
		return meRe;
	}
	@Override
	public MedicalRecord getMeRe(String id) throws Exception {
		MedicalRecordExample meExam = new MedicalRecordExample();
		meExam.createCriteria().andIdEqualTo(id);
		List<MedicalRecord> meList = medicalRecordMapper.selectByExample(meExam);
		MedicalRecord meRe = new MedicalRecord();
		if(Utils.listNotNull(meList)){
			if(meList.get(0) != null){
				meRe = meList.get(0);
			}
		}
		return meRe;
	}
}
