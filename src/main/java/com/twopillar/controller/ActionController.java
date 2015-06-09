package com.twopillar.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.twopillar.entity.ActionInfo;
import com.twopillar.service.IActionService;

@Controller
@RequestMapping("/action")
public class ActionController {
	
	@Resource
	private IActionService actionService;
	
	@ResponseBody
	@RequestMapping("/getActionByType")
	public JSONObject getActionByType(HttpServletRequest request,Model model) {
		String type = request.getParameter("type");
		JSONObject json = new JSONObject();
		json.put("result", actionService.getActionListByType(type));
		/*JSONObject.toJSONString(actionService.getActionListByType(type));*/
		return json;
	}
}
