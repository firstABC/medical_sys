package com.service;

import java.util.List;

import com.dto.PaCaCons;
import com.entity.Patient;
import com.entity.PatientCardVO;

public interface PatientService {
	
	public List<PatientCardVO> getPatientList() throws Exception;
	
	public PatientCardVO getPatient(String patientId) throws Exception;
	
	public List<PatientCardVO> getPatientByCons(PaCaCons paCaCons) throws Exception;
}
