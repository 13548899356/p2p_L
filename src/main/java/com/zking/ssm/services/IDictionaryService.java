package com.zking.ssm.services;

import com.zking.ssm.model.Dictionary;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IDictionaryService {

    //删除
    int deleteByPrimaryKey(Dictionary dictionary);
    //增加
    int insert(Dictionary record);
    //查单个
    Dictionary selectByPrimaryKey(Dictionary dictionary);
    //修改
    int updateByPrimaryKeySelective(Dictionary record);
    //查全部
    List<Dictionary> DictionaryList(Dictionary dictionary, PageBean pageBean);

    //类型查询
    List<Object> TypeList();


}
