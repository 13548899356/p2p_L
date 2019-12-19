package com.zking.ssm.services;

import com.zking.ssm.model.Borrowmoney;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface IBorrowmoneyService {
    int deleteByPrimaryKey(String id);

    int insert(Borrowmoney record);

    int insertSelective(Borrowmoney record);

    Borrowmoney selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Borrowmoney record);

    int updateByPrimaryKey(Borrowmoney record);

    List<Borrowmoney> getListBorrowMoney(Borrowmoney borrowmoney);

    //查询
    List<Borrowmoney> BorrowmoneyList(Borrowmoney borrowmoney, PageBean pageBean);
}