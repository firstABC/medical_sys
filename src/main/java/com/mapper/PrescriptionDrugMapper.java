package com.mapper;

import com.entity.PrescriptionDrug;
import com.entity.PrescriptionDrugExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PrescriptionDrugMapper {
    int countByExample(PrescriptionDrugExample example);

    int deleteByExample(PrescriptionDrugExample example);

    int insert(PrescriptionDrug record);

    int insertSelective(PrescriptionDrug record);

    List<PrescriptionDrug> selectByExample(PrescriptionDrugExample example);

    int updateByExampleSelective(@Param("record") PrescriptionDrug record, @Param("example") PrescriptionDrugExample example);

    int updateByExample(@Param("record") PrescriptionDrug record, @Param("example") PrescriptionDrugExample example);
}