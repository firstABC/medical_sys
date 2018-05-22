package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.PrescriptionExample;
import com.mapper.PrescriptionMapper;
import com.service.PrescriptionService;

@Service("prescriptionService")
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	private PrescriptionMapper prescriptionMapper;
	@Override
	public int selectPrescriptionCode(String prescriptionCode) {
		PrescriptionExample example = new PrescriptionExample();
		example.createCriteria().andPrescriptioncodeEqualTo(prescriptionCode);
		int count = prescriptionMapper.countByExample(example);
		return count;
	}

}
