package com.service;

import java.util.List;

import com.entity.PrescriptionDrug;


public interface PrescriptionDrugService {
	
	public int addPre(PrescriptionDrug drug) throws Exception;
	
	public int deletePre(String id) throws Exception;

	public int updatePre(PrescriptionDrug drug) throws Exception;
	
	public List<PrescriptionDrug> getPreByCons(String prscriptionId) throws Exception;
}
