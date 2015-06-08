package com.twopillar.dao;

import com.twopillar.entity.ReplyInfo;

public interface ReplyInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReplyInfo record);

    int insertSelective(ReplyInfo record);

    ReplyInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReplyInfo record);

    int updateByPrimaryKey(ReplyInfo record);
}