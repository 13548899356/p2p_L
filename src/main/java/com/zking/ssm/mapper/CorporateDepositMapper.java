package com.zking.ssm.mapper;

import com.zking.ssm.model.CorporateDeposit;

import java.util.List;

public interface CorporateDepositMapper {
    int deleteByPrimaryKey(String id);

    int insert(CorporateDeposit record);

    CorporateDeposit selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CorporateDeposit record);

    List<CorporateDeposit> ListDeposit(CorporateDeposit corporateDeposit);

    //审核通过减钱
    int Update(CorporateDeposit corporateDeposit);

}