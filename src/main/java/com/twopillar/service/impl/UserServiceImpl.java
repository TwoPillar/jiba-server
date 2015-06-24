package com.twopillar.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.twopillar.dao.UserInfoMapper;
import com.twopillar.entity.UserInfo;
import com.twopillar.service.IUserService;

@Service("userService")  
public class UserServiceImpl implements IUserService{

	@Resource
	private UserInfoMapper userInfoMapper;
	
	@Override
	public UserInfo getUserById(int id) {
		return userInfoMapper.selectByPrimaryKey(id); 
	}
	
	@Override
	public UserInfo getUserInfoByPhone(String phone) {
		
		return userInfoMapper.selectByPhone(phone);
	}

	@Override
	public UserInfo registerUser(UserInfo userInfo) {
		userInfoMapper.insertSelective(userInfo);
		return userInfoMapper.selectByPrimaryKey(userInfo.getId());
	}
}
