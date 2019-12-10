package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.sysUserMapper;
import com.zking.ssm.model.sysUser;
import com.zking.ssm.services.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SysUserServiceImpl implements ISysUserService {
    @Autowired
    private sysUserMapper userMapper;

    @Override
    public int doRegister(sysUser user) {
        return 0;
    }

    @Override
    public int updateUser(sysUser user) {
        return 0;
    }

    @Override
    public sysUser getUser(sysUser user) {
        return null;
    }

    @Override
    public List<sysUser> getListUser(sysUser user) {
        return null;
    }
}
