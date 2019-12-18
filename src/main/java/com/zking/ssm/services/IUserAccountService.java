package com.zking.ssm.services;

import com.zking.ssm.model.UserAccount;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IUserAccountService {
    int deleteByPrimaryKey(String id);

    int insert(UserAccount record);

    int insertSelective(UserAccount record);

    UserAccount selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(UserAccount record);

    int updateByPrimaryKey(UserAccount record);
}