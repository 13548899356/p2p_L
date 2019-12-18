package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.DictionaryMapper;
import com.zking.ssm.model.Dictionary;
import com.zking.ssm.services.IDictionaryService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DictionaryServiceImpl implements IDictionaryService {

    Dictionary dictionary=new Dictionary();


    @Autowired
    private DictionaryMapper dictionaryMapper;


    @Override
    public int deleteByPrimaryKey(Dictionary dictionary) {
        return dictionaryMapper.deleteByPrimaryKey(dictionary);
    }

    @Override
    public int insert(Dictionary record) {
        return dictionaryMapper.insert(record);
    }

    @Override
    public Dictionary selectByPrimaryKey(Dictionary dictionary) {
        return dictionaryMapper.selectByPrimaryKey(dictionary);
    }

    @Override
    public int updateByPrimaryKeySelective(Dictionary record) {
        return dictionaryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Dictionary> DictionaryList(Dictionary dictionary, PageBean pageBean) {
        return dictionaryMapper.DictionaryList(dictionary);
    }

    @Override
    public List<Object> TypeList() {
        return((List)dictionaryMapper.TypeList());
    }

    @Override
    public List<Dictionary> hdList(Dictionary dictionary) {
        return dictionaryMapper.hdList(dictionary);
    }
}
