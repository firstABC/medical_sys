package com.mapper;

import com.entity.Role_permissions;
import com.entity.Role_permissionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Role_permissionsMapper {
    int countByExample(Role_permissionsExample example);

    int deleteByExample(Role_permissionsExample example);

    int insert(Role_permissions record);

    int insertSelective(Role_permissions record);

    List<Role_permissions> selectByExample(Role_permissionsExample example);

    int updateByExampleSelective(@Param("record") Role_permissions record, @Param("example") Role_permissionsExample example);

    int updateByExample(@Param("record") Role_permissions record, @Param("example") Role_permissionsExample example);
}