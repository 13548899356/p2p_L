package com.zking.ssm.mapper;

import com.zking.ssm.model.Dictionary;

import java.util.List;

public interface DictionaryMapper {
    int deleteByPrimaryKey(Dictionary dictionary);

    int insert(Dictionary record);

    Dictionary selectByPrimaryKey(Dictionary dictionary);

    int updateByPrimaryKeySelective(Dictionary record);

    List<Dictionary> DictionaryList(Dictionary dictionary);

    List<Object> TypeList();

}