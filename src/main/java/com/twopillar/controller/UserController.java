package com.twopillar.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.twopillar.entity.UserInfo;
import com.twopillar.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	public UserInfo register(HttpServletRequest request,Model model) {
		
		int phone = Integer.parseInt(request.getParameter("phone"));
		String password = request.getParameter("password");
		UserInfo userInfo = userService.getUserInfoByPhone(phone);
		if(userInfo != null) {
			return userInfo;
		}else {
			userInfo = new UserInfo();
			userInfo.setPhone(phone);
			userInfo.setPassword(password);
			return userService.registerUser(userInfo);
		}
	}

}
