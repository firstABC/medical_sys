package com.mapper;

import com.entity.MybatisTest;
import com.entity.MybatisTestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MybatisTestMapper {
    int countByExample(MybatisTestExample example);

    int deleteByExample(MybatisTestExample example);

    int insert(MybatisTest record);

    int insertSelective(MybatisTest record);

    List<MybatisTest> selectByExample(MybatisTestExample example);

    int updateByExampleSelective(@Param("record") MybatisTest record, @Param("example") MybatisTestExample example);

    int updateByExample(@Param("record") MybatisTest record, @Param("example") MybatisTestExample example);
}