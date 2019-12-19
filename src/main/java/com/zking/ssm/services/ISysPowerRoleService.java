package com.zking.ssm.services;

import com.zking.ssm.model.SysPowerRole;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface ISysPowerRoleService {
    //根据角色ID和用户ID查看
    SysPowerRole selectSysPowerRoleByRoleId(SysPowerRole sysPowerRole);

    int insert(SysPowerRole record);

    int insertSelective(SysPowerRole record);


}