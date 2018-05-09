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
	public List<MedicalRecord> getMeReList(String icCardNum) throws Exception{
		MedicalRecordExample meExam = new MedicalRecordExample();
		meExam.createCriteria().andIccardnumEqualTo(icCardNum);
		List<MedicalRecord> meList = medicalRecordMapper.selectByExample(meExam);
		if(Utils.listNotNull(meList)){
			return meList;
		}else{
			return new ArrayList<MedicalRecord>();
		}
	}
	@Override
	public int addMeRe(MedicalRecord meRe) throws ParseException {
		meRe.setId(Utils.getUUID());
		meRe.setCreatetime(Utils.getNow());
		int num = 0;
		//插入记录
		num = medicalRecordMapper.insert(meRe);
		return num;
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
