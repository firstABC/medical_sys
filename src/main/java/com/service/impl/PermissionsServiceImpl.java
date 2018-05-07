package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Permissions;
import com.entity.PermissionsExample;
import com.mapper.PermissionsMapper;
import com.service.PermissionsService;

@Service("permissionsService")
public class PermissionsServiceImpl implements PermissionsService {

	@Autowired
	private PermissionsMapper  permissionsMapper;
	
	@Override
	public Permissions selectPermissions(String perid) {
		PermissionsExample permissionsExample = new PermissionsExample();
		permissionsExample.createCriteria().andPeridEqualTo(perid);
		Permissions permissions = (Permissions) permissionsMapper.selectByExample(permissionsExample);
		return permissions;
	}

}
