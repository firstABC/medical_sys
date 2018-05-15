package com.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.entity.IcCard;
import com.entity.IcCardExample;
import com.entity.PatientCardVO;

public interface IcCardMapper {
    int countByExample(IcCardExample example);

    int deleteByExample(IcCardExample example);

    int insert(IcCard record);

    int insertSelective(IcCard record);

    List<IcCard> selectByExample(IcCardExample example);

    int updateByExampleSelective(@Param("record") IcCard record, @Param("example") IcCardExample example);

    int updateByExample(@Param("record") IcCard record, @Param("example") IcCardExample example);
    
    PatientCardVO selectIcCard(@Param("icCardNum")String icCardNum);
}