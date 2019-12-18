package com.zking.ssm.services;

import com.zking.ssm.model.MoneyRecord;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IMoneyRecordService {
    int deleteByPrimaryKey(String id);

    int insert(MoneyRecord record);

    int insertSelective(MoneyRecord record);

    MoneyRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(MoneyRecord record);

    int updateByPrimaryKey(MoneyRecord record);
}