package com.zking.ssm.mapper;

import com.zking.ssm.model.Borrowmoney;
import com.zking.ssm.model.MoneyRecord;

import java.util.List;

public interface MoneyRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(MoneyRecord record);

    int insertSelective(MoneyRecord record);

    MoneyRecord selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(MoneyRecord record);

    int updateByPrimaryKey(MoneyRecord record);

    //查询
    List<Borrowmoney> BorrowmoneyList(Borrowmoney borrowmoney);

}