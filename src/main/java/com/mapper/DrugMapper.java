package com.mapper;

import com.entity.Drug;
import com.entity.DrugExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugMapper {
    int countByExample(DrugExample example);

    int deleteByExample(DrugExample example);

    int insert(Drug record);

    int insertSelective(Drug record);

    List<Drug> selectByExample(DrugExample example);

    int updateByExampleSelective(@Param("record") Drug record, @Param("example") DrugExample example);

    int updateByExample(@Param("record") Drug record, @Param("example") DrugExample example);
    
    List<Drug> selectByCons(@Param("drugName")String drugName, @Param("drugCode")String drugCode);
}