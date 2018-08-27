package com.text.dao;

import com.text.entitys.Appr;

public interface ApprMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Appr record);

    int insertSelective(Appr record);

    Appr selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Appr record);

    int updateByPrimaryKey(Appr record);
}