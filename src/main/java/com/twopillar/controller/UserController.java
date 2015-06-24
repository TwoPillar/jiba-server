package com.twopillar.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.twopillar.entity.UserInfo;
import com.twopillar.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping("/register")
	public JSONObject register(HttpServletRequest request,Model model) {
		
		JSONObject json = new JSONObject();
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		UserInfo userInfo = userService.getUserInfoByPhone(phone);
		if(userInfo != null) {
			json.put("code", "001");	
		}else {
			userInfo = new UserInfo();
			userInfo.setPhone(phone);
			userInfo.setPassword(password);
			userInfo = userService.registerUser(userInfo);
			json.put("result", userInfo);
			json.put("code", "000");
		}
		return json;
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public JSONObject login(HttpServletRequest request,Model model) {	
		
		JSONObject json = new JSONObject();
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		UserInfo userInfo = userService.getUserInfoByPhone(phone);
		if(userInfo != null && userInfo.getPassword().equals(password)) {
			json.put("result", userInfo);
			json.put("code", "000");
		}else {
			json.put("code","001");
		}
		return json;
	}

}
