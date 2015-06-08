package com.twopillar.dao;

import com.twopillar.entity.planCirculation;

public interface planCirculationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(planCirculation record);

    int insertSelective(planCirculation record);

    planCirculation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(planCirculation record);

    int updateByPrimaryKey(planCirculation record);
}