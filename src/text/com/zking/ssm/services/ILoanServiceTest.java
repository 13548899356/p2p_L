package com.zking.ssm.services;

import com.zking.ssm.model.Loan;
import com.zking.ssm.model.Product;
import com.zking.ssm.model.sysUser;
import com.zking.ssm.services.impl.BaseTestCase;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.util.uuidUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class ILoanServiceTest extends BaseTestCase{
    @Autowired
    private ILoanService loanService;

    @Autowired
    private ISysUserService sysUserService;

    @Autowired
    private IProductService productService;


    private Loan loan;
    private PageBean pageBean;

    private sysUser user;
    private Product product;


    @Before
    public void setUp() throws Exception {
       loan =new Loan();
       pageBean=new PageBean();
       user=new sysUser();
       product=new Product();
    }

    @Test
    public void deleteByPrimaryKey() {
        loan.setId(uuidUtil.getUUID());
        loanService.deleteByPrimaryKey(loan.getId());
    }

    @Test
    public void insert() {
        loan.setId(uuidUtil.getUUID());
        loan.setUid("1");
        loan.setPid("1");
        loan.setState(0);
        loan.setType(0);
        loanService.insert(loan);

    }

    @Test
    public void selectByPrimaryKey() {
        loan.setId("09f1094eca0f487f9da9705e463b9e10");
        System.out.println(loanService.selectByPrimaryKey(loan.getId()));

    }

    @Test
    public void updateByPrimaryKeySelective() {
        loan.setId("09f1094eca0f487f9da9705e463b9e10");
        loan.setType(0);
        loanService.updateByPrimaryKeySelective(loan);
    }

    @Test
    public void listLoan() {
        loan.setId("2");
        List<Loan> loans = loanService.ListLoan(loan,pageBean);
        pageBean.getTotal();
        System.out.println(pageBean.getTotal());
        for (Loan loan1:loans) {


            user.setUid(loan1.getUid());
            product.setId(loan1.getPid());
            loan1.setSysUser(sysUserService.getListUser(user,pageBean).get(0));
            loan1.setProduct(productService.getListProduct(product,pageBean).get(0));
            System.out.println(loan1);
        }
    }
}