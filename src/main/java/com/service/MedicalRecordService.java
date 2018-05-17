package com.service;

import java.text.ParseException;
import java.util.List;

import com.dto.MedicalRecordCons;
import com.entity.Drug;
import com.entity.MedicalRecord;

public interface MedicalRecordService {
	
	public List<MedicalRecord> getMeReList() throws Exception;
	
	public List<MedicalRecord> getMeReListByCons(String icCardNum) throws Exception;
	
	public MedicalRecord addMeRe(MedicalRecordCons meReC) throws ParseException;
	
	public MedicalRecord updateMeRe(MedicalRecordCons meReC) throws ParseException;
	
	public MedicalRecord getMeRe(String id) throws Exception;
}
