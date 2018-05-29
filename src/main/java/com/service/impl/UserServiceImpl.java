package com.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.User;
import com.entity.UserExample;
import com.mapper.UserMapper;
import com.service.UserService;
@Service("UserService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public User userVerify(User user) {
		UserExample uExam = new UserExample();
		uExam.createCriteria().andUseraccountEqualTo(user.getUseraccount())
								.andUserpwdEqualTo(user.getUserpwd());
		List<User> ltUser =  userMapper.selectByExample(uExam);
		if(ltUser!=null&&ltUser.size()>0){
			User user1 = ltUser.get(0);
			return user1;
		}
		return null;
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

	@Override
	public List<User> selectUserAll() {
		List<User> ltUser = userMapper.selectByExample(null);
		return ltUser;
	}

	@Override
	public int createUser(User user) {
		int isOk = userMapper.insertSelective(user);
		return isOk;
	}
	
	
}
