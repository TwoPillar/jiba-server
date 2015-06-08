package com.twopillar.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/action")
public class ActionController {
	
	@RequestMapping("/getActionByType")
	public String getActionByType(HttpServletRequest request,Model model) {
		String type = request.getParameter("type");
		return "test";
	}
}
