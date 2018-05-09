package com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.PaCaCons;
import com.entity.Patient;
import com.entity.PatientCardVO;
import com.entity.PatientExample;
import com.mapper.PatientMapper;
import com.service.PatientService;
import com.util.Utils;

@Service("PatientService")
public class PatientServiceImpl implements PatientService{
	
	@SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private PatientMapper patientMapper;
	
	/**
	 * 获取患者列表-关联ICCard信息
	 */
	@Override
	public List<PatientCardVO> getPatientList() throws Exception{
		PatientExample pExam = new PatientExample();
		//获取List
		List<PatientCardVO> pList = patientMapper.selectPatientIcCard(pExam);
		if(Utils.listNotNull(pList)){
			return pList;
		}else{
			return new ArrayList<PatientCardVO>();
		}
		
	}
	/**
	 * 根据患者ID查询患者信息管理ICCard
	 */
	@Override
	public PatientCardVO getPatient(String patientId) throws Exception {
		PatientExample pExam = new PatientExample();
		pExam.createCriteria().andPatientidEqualTo(patientId);
		List<PatientCardVO> pList = patientMapper.selectPatientIcCard(pExam);
		PatientCardVO patientCardVO = new PatientCardVO();
		if(Utils.listNotNull(pList)){
			if(pList.get(0) != null){
				patientCardVO = pList.get(0);
			}
		}
		return patientCardVO;
	}
	/**
	 * 多条件模糊查询患者列表
	 */
	@Override
	public List<PatientCardVO> getPatientByCons(PaCaCons paCaCons)
			throws Exception {
		if(Utils.stringNotEmpty(paCaCons.getIccardnum())){
			paCaCons.setIccardnum("%"+paCaCons.getIccardnum()+"%");
		}
		if(Utils.stringNotEmpty(paCaCons.getPaname())){
			paCaCons.setPaname("%"+paCaCons.getPaname()+"%");
		}
		if(Utils.stringNotEmpty(paCaCons.getPaphone())){
			paCaCons.setPaphone("%"+paCaCons.getPaphone()+"%");
		}
		if(Utils.stringNotEmpty(paCaCons.getIsstatus())){
			paCaCons.setIsstatus("%"+paCaCons.getIsstatus()+"%");
		}
		List<PatientCardVO> pList = patientMapper.selectPatientByCons(paCaCons);
		if(Utils.listNotNull(pList)){
			return pList;
		}else{
			return new ArrayList<PatientCardVO>();
		}
		
	}
}
