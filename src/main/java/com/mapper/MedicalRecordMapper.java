package com.mapper;

import com.entity.MedicalRecord;
import com.entity.MedicalRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalRecordMapper {
    int countByExample(MedicalRecordExample example);

    int deleteByExample(MedicalRecordExample example);

    int insert(MedicalRecord record);

    int insertSelective(MedicalRecord record);

    List<MedicalRecord> selectByExample(MedicalRecordExample example);

    int updateByExampleSelective(@Param("record") MedicalRecord record, @Param("example") MedicalRecordExample example);

    int updateByExample(@Param("record") MedicalRecord record, @Param("example") MedicalRecordExample example);
}