package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Role_permissions;
import com.entity.Role_permissionsExample;
import com.mapper.Role_permissionsMapper;
import com.service.Role_permissionsService;
@Service("role_permissionsService")
public class Role_permissionsServiceImpl implements Role_permissionsService {

	@Autowired
	private Role_permissionsMapper role_permissionsMapper;

	@Override
	public List<Role_permissions> selectRole_permissions(String roleid) {
		Role_permissionsExample role_permissionsExample = new Role_permissionsExample();
		role_permissionsExample.createCriteria().andRoleidEqualTo(roleid);
		List<Role_permissions> ltrolePermissions =  role_permissionsMapper.selectByExample(role_permissionsExample);
		return ltrolePermissions;
	}
	
}
