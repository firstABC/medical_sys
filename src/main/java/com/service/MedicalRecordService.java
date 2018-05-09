package com.service;

import java.text.ParseException;
import java.util.List;

import com.entity.Drug;
import com.entity.MedicalRecord;

public interface MedicalRecordService {
	
	public List<MedicalRecord> getMeReList(String icCardNum) throws Exception;
	
	public int addMeRe(MedicalRecord meRe) throws ParseException;
	
	public MedicalRecord getMeRe(String id) throws Exception;
}
