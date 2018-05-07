package com.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.User;
import com.entity.UserExample;
import com.mapper.UserMapper;
import com.service.UserService;

public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User userVerify(User user) {
		UserExample uExam = new UserExample();
		uExam.createCriteria().andUseraccountEqualTo(user.getUseraccount())
								.andUserpwdEqualTo(user.getUserpwd());
		User use1 = (User) userMapper.selectByExample(uExam);
		return use1;
	}

	@Override
	public int updateLastTime(String userid,Date lastTime) {
		UserExample uExam = new UserExample();
		uExam.createCriteria().andUseridEqualTo(userid);
		User record = new User();
		record.setLasttime(lastTime);
		int isOk = userMapper.updateByExampleSelective(record, uExam);
		return isOk;
	}
	
	
}
