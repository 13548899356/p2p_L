package com.zking.ssm.mapper;

import com.zking.ssm.model.SysPowerRole;

import java.util.List;

public interface SysPowerRoleMapper {
    //根据角色ID和用户查看
    SysPowerRole selectSysPowerRoleByRoleId(SysPowerRole sysPowerRole);

    int insert(SysPowerRole record);

    int insertSelective(SysPowerRole record);



}