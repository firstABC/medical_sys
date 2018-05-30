package com.service;

import java.util.Date;
import java.util.List;

import com.entity.User;

public interface UserService {
	
	/**
	 * 登录验证
	 * @param user
	 * @return
	 */
	public User userVerify(User user);
	
	/**
	 * 修改最后登录时间
	 * @param userid
	 * @param lastTime
	 * @return
	 */
	public int updateLastTime(String userid,Date lastTime);
	/**
	 * 获取所有的用户
	 * @return
	 */
	public List<User> selectUserAll();
	
	/**
	 * 查询用户信息
	 * @param userId
	 * @return
	 */
	public User selectUser(String userId);
	
	/**
	 * 创建用户
	 * @param user
	 * @return
	 */
	public int createUser(User user);
	
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public int editUser(User user);
	
	
}
