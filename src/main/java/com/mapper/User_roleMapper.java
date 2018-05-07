package com.mapper;

import com.entity.User_role;
import com.entity.User_roleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface User_roleMapper {
    int countByExample(User_roleExample example);

    int deleteByExample(User_roleExample example);

    int insert(User_role record);

    int insertSelective(User_role record);

    List<User_role> selectByExample(User_roleExample example);

    int updateByExampleSelective(@Param("record") User_role record, @Param("example") User_roleExample example);

    int updateByExample(@Param("record") User_role record, @Param("example") User_roleExample example);
}