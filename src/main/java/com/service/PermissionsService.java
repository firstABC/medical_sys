package com.service;

import com.entity.Permissions;

public interface PermissionsService {

	/**
	 * 查询权限
	 * @param perid
	 * @return
	 */
	public Permissions selectPermissions(String perid);
}
