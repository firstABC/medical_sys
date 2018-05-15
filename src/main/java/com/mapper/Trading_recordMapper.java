package com.mapper;

import com.entity.Trading_record;
import com.entity.Trading_recordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Trading_recordMapper {
    int countByExample(Trading_recordExample example);

    int deleteByExample(Trading_recordExample example);

    int insert(Trading_record record);

    int insertSelective(Trading_record record);

    List<Trading_record> selectByExample(Trading_recordExample example);

    int updateByExampleSelective(@Param("record") Trading_record record, @Param("example") Trading_recordExample example);

    int updateByExample(@Param("record") Trading_record record, @Param("example") Trading_recordExample example);
}