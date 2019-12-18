package com.zking.ssm.mapper;

import com.zking.ssm.model.Borrowmoney;

import java.util.List;

public interface BorrowmoneyMapper {
    int deleteByPrimaryKey(String id);

    int insert(Borrowmoney record);

    int insertSelective(Borrowmoney record);

    Borrowmoney selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Borrowmoney record);

    int updateByPrimaryKey(Borrowmoney record);

    List<Borrowmoney> getListBorrowMoney(Borrowmoney borrowmoney);
}