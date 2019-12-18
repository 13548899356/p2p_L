package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.LoanMapper;
import com.zking.ssm.model.Loan;
import com.zking.ssm.services.ILoanService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImpl implements ILoanService {

    @Autowired
    private LoanMapper loanMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return loanMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Loan record) {
        return loanMapper.insert(record);
    }

    @Override
    public Loan selectByPrimaryKey(String id) {
        return loanMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Loan record) {
        return loanMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<Loan> ListLoan(Loan loan, PageBean pageBean) {
        return loanMapper.ListLoan(loan);
    }

    @Override
    public int Update(Loan loan) {
        return loanMapper.Update(loan);
    }

    @Override
    public int Updatecg(Loan loan) {
        return loanMapper.Updatecg(loan);
    }
}
