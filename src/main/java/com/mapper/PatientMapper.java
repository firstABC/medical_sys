package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.dto.PaCaCons;
import com.entity.Patient;
import com.entity.PatientCardVO;
import com.entity.PatientExample;

public interface PatientMapper {
    int countByExample(PatientExample example);

    int deleteByExample(PatientExample example);

    int insert(Patient record);

    int insertSelective(Patient record);

    List<Patient> selectByExample(PatientExample example);

    int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);
    
    List<PatientCardVO> selectPatientIcCard(PatientExample example);
    
    List<PatientCardVO> selectPatientByCons(PaCaCons paCaCons);
}