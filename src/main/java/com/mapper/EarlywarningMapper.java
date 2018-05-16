package com.mapper;

import com.entity.Earlywarning;
import com.entity.EarlywarningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EarlywarningMapper {
    int countByExample(EarlywarningExample example);

    int deleteByExample(EarlywarningExample example);

    int insert(Earlywarning record);

    int insertSelective(Earlywarning record);

    List<Earlywarning> selectByExample(EarlywarningExample example);

    int updateByExampleSelective(@Param("record") Earlywarning record, @Param("example") EarlywarningExample example);

    int updateByExample(@Param("record") Earlywarning record, @Param("example") EarlywarningExample example);
}