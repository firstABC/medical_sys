package com.mapper;

import com.entity.IcCard;
import com.entity.IcCardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcCardMapper {
    int countByExample(IcCardExample example);

    int deleteByExample(IcCardExample example);

    int insert(IcCard record);

    int insertSelective(IcCard record);

    List<IcCard> selectByExample(IcCardExample example);

    int updateByExampleSelective(@Param("record") IcCard record, @Param("example") IcCardExample example);

    int updateByExample(@Param("record") IcCard record, @Param("example") IcCardExample example);
}