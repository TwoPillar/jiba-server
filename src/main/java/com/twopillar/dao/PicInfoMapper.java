package com.twopillar.dao;

import com.twopillar.entity.PicInfo;

public interface PicInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(PicInfo record);

    int insertSelective(PicInfo record);

    PicInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PicInfo record);

    int updateByPrimaryKey(PicInfo record);
}