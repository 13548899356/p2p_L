package com.zking.ssm.mapper;

import com.zking.ssm.model.userIdentity;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface userIdentityMapper {
    //添加
    int insert(userIdentity record);
    //查询
    userIdentity getIdentity(userIdentity identity);
    //解绑手机号或者切换
    int updateIdentity(String phone);
    //查询集合
    List<userIdentity> getListIdentity(userIdentity identity);
    //修改信息
    int updateIdentitySelectKey(userIdentity identity);


}