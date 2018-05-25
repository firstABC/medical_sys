package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.PrescriptionDrug;
import com.entity.PrescriptionDrugExample;
import com.mapper.PrescriptionDrugMapper;
import com.service.PrescriptionDrugService;
import com.util.Utils;

@Service("preDrugService")
public class PrescriptionDrugServiceImpl implements PrescriptionDrugService{
	
	@SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private PrescriptionDrugMapper preDrugMapper;
	
	@Override
	public int addPre(PrescriptionDrug drug) throws Exception {
		drug.setId(Utils.getUUID());
		int num = 0;
		num = preDrugMapper.insert(drug);
		return num;
	}

	@Override
	public int deletePre(String id) throws Exception {
		PrescriptionDrugExample pExam = new PrescriptionDrugExample();
		pExam.createCriteria().andIdEqualTo(id);
		int num = 0;
		num = preDrugMapper.deleteByExample(pExam);
		return num;
	}

	@Override
	public int updatePre(PrescriptionDrug drug) throws Exception {
		PrescriptionDrugExample pExam = new PrescriptionDrugExample();
		pExam.createCriteria().andIdEqualTo(drug.getId());
		int num = 0;
		num = preDrugMapper.updateByExample(drug, pExam);
		return num;
	}

	@Override
	public List<PrescriptionDrug> getPreByCons(String prscriptionId)
			throws Exception {
		PrescriptionDrugExample pExam = new PrescriptionDrugExample();
		pExam.createCriteria().andPrescriptionidEqualTo(prscriptionId);
		List<PrescriptionDrug> pList = preDrugMapper.selectByExample(pExam);
		if(Utils.listNotNull(pList)){
			return pList;
		}else{
			return new ArrayList<PrescriptionDrug>();
		}
	}

}
