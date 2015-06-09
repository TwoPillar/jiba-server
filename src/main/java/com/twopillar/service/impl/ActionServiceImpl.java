package com.twopillar.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.twopillar.dao.ActionInfoMapper;
import com.twopillar.entity.ActionInfo;
import com.twopillar.service.IActionService;
@Service("actionService")
public class ActionServiceImpl implements IActionService {
	
	@Resource
	public ActionInfoMapper actionInfoMapper;
	
	@Override
	public List<ActionInfo> getActionListByType(String type) {
		// TODO Auto-generated method stub
		return actionInfoMapper.selectByType(type);
	}

}
