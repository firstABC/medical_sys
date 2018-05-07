package com.service;

import java.util.Date;

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
}
