package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.platFormBankInfoMapper;
import com.zking.ssm.model.platFormBankInfo;
import com.zking.ssm.services.IplatFormBankInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatFormBankInfoImpl implements IplatFormBankInfoService {

    @Autowired
    private platFormBankInfoMapper bankInfoMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return bankInfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(platFormBankInfo record) {
        return bankInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(platFormBankInfo record) {
        return bankInfoMapper.insertSelective(record);
    }

    @Override
    public List<platFormBankInfo> selectByPrimaryKey(platFormBankInfo bankInfo) {
        return bankInfoMapper.selectByPrimaryKey(bankInfo);
    }


    @Override
    public int updateByPrimaryKeySelective(platFormBankInfo record) {
        return bankInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(platFormBankInfo record) {
        return bankInfoMapper.updateByPrimaryKey(record);
    }
}
