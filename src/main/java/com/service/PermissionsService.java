package com.service;

import java.util.List;

import com.entity.Permissions;

public interface PermissionsService {

	/**
	 * 查询权限
	 * @param perid
	 * @return
	 */
	public Permissions selectPermissions(String perid);
	
	/**
	 * 查询所有的权限
	 * @return
	 */
	public List<Permissions> selectPermissions();
}
