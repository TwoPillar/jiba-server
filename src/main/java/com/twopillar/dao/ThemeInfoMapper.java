package com.twopillar.dao;

import com.twopillar.entity.ThemeInfo;

public interface ThemeInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ThemeInfo record);

    int insertSelective(ThemeInfo record);

    ThemeInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ThemeInfo record);

    int updateByPrimaryKey(ThemeInfo record);
}