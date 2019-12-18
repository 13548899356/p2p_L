package com.zking.ssm.mapper;

import com.zking.ssm.model.Loan;

import java.util.List;

public interface LoanMapper {
    int deleteByPrimaryKey(String id);

    int insert(Loan record);

    Loan selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Loan record);

    List<Loan> ListLoan(Loan loan);

    //审核失败
    int Update(Loan loan);

    //审核成功
    int Updatecg(Loan loan);


}