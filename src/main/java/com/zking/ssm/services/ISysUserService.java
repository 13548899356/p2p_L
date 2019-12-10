package com.zking.ssm.services;

import com.zking.ssm.model.sysUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface ISysUserService {

    int doRegister(sysUser user);

    int updateUser(sysUser user);

    sysUser getUser(sysUser user);

    List<sysUser> getListUser(sysUser user);

}