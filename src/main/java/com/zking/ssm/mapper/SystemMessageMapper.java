package com.zking.ssm.mapper;

import com.zking.ssm.model.SystemMessage;

import java.util.List;

public interface SystemMessageMapper {
    //删除个人系统信息
    int deleteByPrimaryKey(String id);
    //添加系统信息
    int insert(SystemMessage record);
    //智能添加
    int insertSelective(SystemMessage record);
    //查询个人用户获取的系统信息
    List<SystemMessage> selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(SystemMessage record);

    int updateByPrimaryKey(SystemMessage record);
}