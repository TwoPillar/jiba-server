package com.twopillar.dao;

import com.twopillar.entity.planInfo;

public interface planInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(planInfo record);

    int insertSelective(planInfo record);

    planInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(planInfo record);

    int updateByPrimaryKey(planInfo record);
}