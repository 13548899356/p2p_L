package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.CorporateDepositMapper;
import com.zking.ssm.model.CorporateDeposit;
import com.zking.ssm.services.ICorporateDepostitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorporateDepostitServiceImpl implements ICorporateDepostitService {

    @Autowired
    private CorporateDepositMapper depositMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return depositMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(CorporateDeposit record) {
        return depositMapper.insert(record);
    }

    @Override
    public CorporateDeposit selectByPrimaryKey(String id) {
        return depositMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(CorporateDeposit record) {
        return depositMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<CorporateDeposit> ListDeposit(CorporateDeposit corporateDeposit) {
        return depositMapper.ListDeposit(corporateDeposit);
    }

    @Override
    public int Update(CorporateDeposit corporateDeposit) {
        return depositMapper.Update(corporateDeposit);
    }
}
