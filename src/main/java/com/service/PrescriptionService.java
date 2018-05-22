package com.service;

public interface PrescriptionService {

	/**
	 * 查询编号是否已使用
	 * @param prescriptionCode
	 * @return
	 */
	public int selectPrescriptionCode(String prescriptionCode);
}
