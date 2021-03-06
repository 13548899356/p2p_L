package com.zking.ssm.services;

import com.zking.ssm.model.Loan;
import com.zking.ssm.util.PageBean;

import java.util.List;

public interface ILoanService {

    int deleteByPrimaryKey(String id);

    int insert(Loan record);

    Loan selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Loan record);

    List<Loan> ListLoan(Loan loan, PageBean pageBean);

    //审核失败
    int Update(Loan loan);

    //审核成功
    int Updatecg(Loan loan);

}
