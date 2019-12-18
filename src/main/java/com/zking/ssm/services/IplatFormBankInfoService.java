package com.zking.ssm.services;

import com.zking.ssm.model.platFormBankInfo;

import java.util.List;

public interface IplatFormBankInfoService {
    int deleteByPrimaryKey(String id);

    int insert(platFormBankInfo record);

    int insertSelective(platFormBankInfo record);

    List<platFormBankInfo> selectByPrimaryKey(platFormBankInfo bankInfo);

    int updateByPrimaryKeySelective(platFormBankInfo record);

    int updateByPrimaryKey(platFormBankInfo record);
}