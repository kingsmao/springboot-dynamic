package com.kingmao.dynamic.peach.dao;

import com.kingmao.dynamic.peach.entity.Peach;

public interface PeachMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Peach record);

    int insertSelective(Peach record);

    Peach selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Peach record);

    int updateByPrimaryKey(Peach record);
}