package com.twopillar.service;

import java.util.List;

import com.twopillar.entity.ActionInfo;

public interface IActionService {

	public List<ActionInfo> getActionListByType(String type);
}
