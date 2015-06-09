package com.twopillar.service;

import com.twopillar.entity.UserInfo;

public interface IUserService {
	public UserInfo getUserById(int id);
	
	/**
	 * @param phone
	 * @return
	 * 通过手机号查找用户
	 */
	public UserInfo getUserInfoByPhone(Integer phone);
	
	/**
	 * @param userInfo
	 * @return
	 * 注册用户
	 */
	public UserInfo registerUser(UserInfo userInfo);
}
