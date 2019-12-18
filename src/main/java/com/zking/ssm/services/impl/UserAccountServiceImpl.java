package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.UserAccountMapper;
import com.zking.ssm.model.UserAccount;
import com.zking.ssm.services.IUserAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements IUserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return userAccountMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserAccount record) {
        return userAccountMapper.insert(record);
    }

    @Override
    public int insertSelective(UserAccount record) {
        return userAccountMapper.insertSelective(record);
    }

    @Override
    public UserAccount selectByPrimaryKey(String id) {
        return userAccountMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserAccount record) {
        return userAccountMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserAccount record) {
        return userAccountMapper.updateByPrimaryKey(record);
    }
}
