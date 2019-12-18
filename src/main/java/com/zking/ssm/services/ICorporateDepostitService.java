package com.zking.ssm.services;

import com.zking.ssm.model.CorporateDeposit;

import java.util.List;

public interface ICorporateDepostitService {
    int deleteByPrimaryKey(String id);

    int insert(CorporateDeposit record);

    CorporateDeposit selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CorporateDeposit record);

    List<CorporateDeposit> ListDeposit(CorporateDeposit corporateDeposit);

    //减钱
    int Update(CorporateDeposit corporateDeposit);

}
