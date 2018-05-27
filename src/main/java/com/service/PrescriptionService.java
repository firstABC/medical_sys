package com.service;

import java.util.List;

import com.entity.Prescription;

public interface PrescriptionService {

	/**
	 * 查询编号是否已使用
	 * @param prescriptionCode
	 * @return
	 */
	public int selectPrescriptionCode(String prescriptionCode);
	
	/**
	 * 根据卡号和医生姓名进行模糊查询
	 * @param icCardNum
	 * @param physician
	 * @return
	 */
	public List<Prescription> getPrListByCons(String icCardNum,String physician);
	
	/**
	 * 根据处方id查询处方
	 * @param prescriptionId
	 * @return
	 */
	public Prescription queryPrescriptionById(String prescriptionId);
	
}
