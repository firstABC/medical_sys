package com.service;

import java.text.ParseException;
import java.util.List;

import com.entity.MedicalRecord;

public interface MedicalRecordService {
	
	public List<MedicalRecord> getMeReList() throws Exception;
	
	public List<MedicalRecord> getMeReListByCons(String icCardNum) throws Exception;
	
	public MedicalRecord addMeRe(MedicalRecord meRe) throws ParseException;
	
	public MedicalRecord updateMeRe(MedicalRecord meRe) throws ParseException;
	
	public MedicalRecord getMeRe(String id) throws Exception;
}
