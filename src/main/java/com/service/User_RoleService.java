package com.service;

import java.util.List;

import com.entity.User_role;

public interface User_RoleService {

	/**
	 * 根据用户id查询具有的角色
	 * @param userid
	 * @return
	 */
	public List<User_role> selectUserRole(String userid);
	
	/**
	 * 添加用户权限关联
	 * @return
	 */
	public int insertUser_Role(User_role user_role);
}
