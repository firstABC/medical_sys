package com.service;

import java.util.List;

import com.entity.Role_permissions;

public interface Role_permissionsService {

	public List<Role_permissions> selectRole_permissions(String roleid);
	/**
	 * 根据角色id删除所有的权限
	 * @param roleid
	 * @return
	 */
	public int dropRP(String roleid);
	
	/**
	 * 添加权限
	 * @param roleId
	 * @param perId
	 * @return
	 */
	public int insertRP(String roleId,String perId);
}
