package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.BorrowmoneyMapper;
import com.zking.ssm.model.Borrowmoney;
import com.zking.ssm.services.IBorrowmoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBorrowmoneyImpl implements IBorrowmoneyService {

    @Autowired
    private BorrowmoneyMapper borrowmoneyMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return 0;
    }

    @Override
    public int insert(Borrowmoney record) {
        return 0;
    }

    @Override
    public int insertSelective(Borrowmoney record) {
        return 0;
    }

    @Override
    public Borrowmoney selectByPrimaryKey(String id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Borrowmoney record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Borrowmoney record) {
        return 0;
    }

    @Override
    public List<Borrowmoney> getListBorrowMoney(Borrowmoney borrowmoney) {
        return null;
    }
}
