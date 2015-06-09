package com.twopillar.dao;

import java.util.List;

import com.twopillar.entity.ActionInfo;

public interface ActionInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ActionInfo record);

    int insertSelective(ActionInfo record);

    ActionInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ActionInfo record);

    int updateByPrimaryKey(ActionInfo record);
    
    List<ActionInfo> selectByType(String type);
}