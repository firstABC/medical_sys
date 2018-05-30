package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User_role;
import com.entity.User_roleExample;
import com.mapper.User_roleMapper;
import com.service.User_RoleService;
@Service("User_RoleService")
public class User_RoleServiceImpl implements User_RoleService {

	@Autowired
	private User_roleMapper user_roleMapper;
	@Override
	public List<User_role> selectUserRole(String userid) {
		User_roleExample user_roleExample = new User_roleExample();
		user_roleExample.createCriteria().andUseridEqualTo(userid);
		List<User_role> ltuserRole = user_roleMapper.selectByExample(user_roleExample);
		return ltuserRole;
	}
	@Override
	public int insertUser_Role(User_role user_role) {
		int isOk = user_roleMapper.insert(user_role);
		return isOk;
	}
	@Override
	public int deleteUser_role(String userid) {
		User_roleExample user_roleExample = new User_roleExample();
		user_roleExample.createCriteria().andUseridEqualTo(userid);
		int isOk = user_roleMapper.deleteByExample(user_roleExample);
		return isOk;
	}

}
