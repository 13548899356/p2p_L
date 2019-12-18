package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.MoneyRecordMapper;
import com.zking.ssm.model.MoneyRecord;
import com.zking.ssm.services.IMoneyRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MoneyRecordServiceImpl implements IMoneyRecordService {

    @Autowired
    private MoneyRecordMapper recordMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return recordMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(MoneyRecord record) {
        return recordMapper.insert(record);
    }

    @Override
    public int insertSelective(MoneyRecord record) {
        return recordMapper.insertSelective(record);
    }

    @Override
    public MoneyRecord selectByPrimaryKey(String id) {
        return recordMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(MoneyRecord record) {
        return recordMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(MoneyRecord record) {
        return recordMapper.updateByPrimaryKey(record);
    }
}
