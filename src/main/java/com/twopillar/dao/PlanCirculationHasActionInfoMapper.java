package com.twopillar.dao;

import com.twopillar.entity.PlanCirculationHasActionInfo;
import com.twopillar.entity.PlanCirculationHasActionInfoKey;

public interface PlanCirculationHasActionInfoMapper {
    int deleteByPrimaryKey(PlanCirculationHasActionInfoKey key);

    int insert(PlanCirculationHasActionInfo record);

    int insertSelective(PlanCirculationHasActionInfo record);

    PlanCirculationHasActionInfo selectByPrimaryKey(PlanCirculationHasActionInfoKey key);

    int updateByPrimaryKeySelective(PlanCirculationHasActionInfo record);

    int updateByPrimaryKey(PlanCirculationHasActionInfo record);
}