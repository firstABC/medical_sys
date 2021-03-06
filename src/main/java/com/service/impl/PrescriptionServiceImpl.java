package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Prescription;
import com.entity.PrescriptionDrug;
import com.entity.PrescriptionDrugExample;
import com.entity.PrescriptionExample;
import com.mapper.PrescriptionDrugMapper;
import com.mapper.PrescriptionMapper;
import com.service.PrescriptionService;
import com.util.Utils;

@Service("prescriptionService")
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	private PrescriptionMapper prescriptionMapper;
	@Autowired
	private PrescriptionDrugMapper prescriptionDrugMapper;
	@Override
	public int selectPrescriptionCode(String prescriptionCode) {
		PrescriptionExample example = new PrescriptionExample();
		example.createCriteria().andPrescriptioncodeEqualTo(prescriptionCode);
		int count = prescriptionMapper.countByExample(example);
		return count;
	}
	@Override
	public List<Prescription> getPrListByCons(String icCardNum, String physician) {
		PrescriptionExample example = new PrescriptionExample();
		if(Utils.stringNotEmpty(icCardNum)){
			example.createCriteria().andIccardnumEqualTo(icCardNum);
		}
		if(Utils.stringNotEmpty(physician)){
			example.createCriteria().andPhysicianEqualTo(physician);
		}
		example.setOrderByClause("createTime desc");
		List<Prescription> ltPrescription = prescriptionMapper.selectByExample(example);
		return ltPrescription;
	}
	@Override
	public Prescription queryPrescriptionById(String prescriptionId) {
		Prescription prescription= prescriptionMapper.selectPrescriptionById(prescriptionId);
		if(prescription!=null){
			PrescriptionDrugExample example = new PrescriptionDrugExample();
			List<PrescriptionDrug> ltPreD = prescriptionDrugMapper.selectByExample(example);
			prescription.setLtPrDList(ltPreD);
		}
		return prescription;
	}

}
