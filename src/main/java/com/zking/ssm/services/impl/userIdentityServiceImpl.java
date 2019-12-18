package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.userIdentityMapper;
import com.zking.ssm.model.userIdentity;
import com.zking.ssm.services.IuserIdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userIdentityServiceImpl implements IuserIdentityService {

    @Autowired
    private userIdentityMapper identityMapper;

    @Override
    public int insert(userIdentity record) {
        return identityMapper.insert(record);
    }

    @Override
    public userIdentity getIdentity(userIdentity identity) {
        return identityMapper.getIdentity(identity);
    }

    @Override
    public int updateIdentity( String phone) {
        return identityMapper.updateIdentity(phone);
    }

    @Override
    public List<userIdentity> getListIdentity(userIdentity identity) {
        return null;
    }

    @Override
    public int updateIdentitySelectKey(userIdentity identity) {
        return identityMapper.updateIdentitySelectKey(identity);
    }
}
