package com.zking.ssm.services;

import com.zking.ssm.model.userIdentity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface IuserIdentityService {
    //添加
    int insert(userIdentity record);
    //查询
    userIdentity getIdentity(userIdentity identity);
    //修改
    int updateIdentity(String phone);
    //查询集合
    List<userIdentity> getListIdentity(userIdentity identity);
    //修改信息
    int updateIdentitySelectKey(userIdentity identity);
}