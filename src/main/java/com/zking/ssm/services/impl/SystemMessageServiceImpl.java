package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.SystemMessageMapper;
import com.zking.ssm.model.SystemMessage;
import com.zking.ssm.services.ISystemMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SystemMessageServiceImpl implements ISystemMessageService {

    @Autowired
    private SystemMessageMapper messageMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return messageMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SystemMessage record) {
        return messageMapper.insert(record);
    }

    @Override
    public int insertSelective(SystemMessage record) {
        return messageMapper.insertSelective(record);
    }

    @Override
    public List<SystemMessage> selectByPrimaryKey(String uid) {
        return messageMapper.selectByPrimaryKey(uid);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemMessage record) {
        return messageMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SystemMessage record) {
        return messageMapper.updateByPrimaryKey(record);
    }
}
