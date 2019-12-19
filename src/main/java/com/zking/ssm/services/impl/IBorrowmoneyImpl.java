package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.BorrowmoneyMapper;
import com.zking.ssm.model.Borrowmoney;
import com.zking.ssm.services.IBorrowmoneyService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBorrowmoneyImpl implements IBorrowmoneyService {

    @Autowired
    private BorrowmoneyMapper borrowmoneyMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return borrowmoneyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Borrowmoney record) {
        return borrowmoneyMapper.insert(record);
    }

    @Override
    public int insertSelective(Borrowmoney record) {
        return borrowmoneyMapper.insertSelective(record);
    }

    @Override
    public Borrowmoney selectByPrimaryKey(String id) {
        return borrowmoneyMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Borrowmoney record) {
        return borrowmoneyMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Borrowmoney record) {
        return borrowmoneyMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Borrowmoney> getListBorrowMoney(Borrowmoney borrowmoney) {
        return borrowmoneyMapper.getListBorrowMoney(borrowmoney);
    }

    @Override
    public List<Borrowmoney> BorrowmoneyList(Borrowmoney borrowmoney, PageBean pageBean) {
        return borrowmoneyMapper.BorrowmoneyList(borrowmoney);
    }
}
