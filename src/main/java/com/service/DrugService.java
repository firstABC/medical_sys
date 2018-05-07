package com.service;

import java.util.List;

import com.entity.Drug;

public interface DrugService {
	
	public List<Drug> getDrugList() throws Exception;
	
	public int addDrug(Drug drug) throws Exception;
	
	public int deleteDrug(String drugId) throws Exception;

	public int updateDrug(Drug drug) throws Exception;
}
