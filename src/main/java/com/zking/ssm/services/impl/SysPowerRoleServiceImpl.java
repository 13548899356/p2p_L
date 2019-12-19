package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.SysPowerRoleMapper;
import com.zking.ssm.model.SysPowerRole;
import com.zking.ssm.services.ISysPowerRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPowerRoleServiceImpl implements ISysPowerRoleService {

    @Autowired
    private SysPowerRoleMapper sysPowerRoleMapper;

    @Override
    public SysPowerRole selectSysPowerRoleByRoleId(SysPowerRole sysPowerRole) {
        return sysPowerRoleMapper.selectSysPowerRoleByRoleId(sysPowerRole);
    }

    @Override
    public int insert(SysPowerRole record) {
        return 0;
    }

    @Override
    public int insertSelective(SysPowerRole record) {
        return 0;
    }


}
