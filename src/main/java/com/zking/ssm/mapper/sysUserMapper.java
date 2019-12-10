package com.zking.ssm.mapper;

import com.zking.ssm.model.sysUser;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface sysUserMapper {

    int doRegister(sysUser user);

    int updateUser(sysUser user);

    sysUser getUser(sysUser user);

    List<sysUser> getListUser(sysUser user);

}