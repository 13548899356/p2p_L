package com.zking.ssm.services;

import com.zking.ssm.model.CorporateDeposit;
import com.zking.ssm.services.impl.BaseTestCase;
import com.zking.ssm.util.uuidUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

public class ICorporateDepostitServiceTest extends BaseTestCase{

    @Autowired
    private ICorporateDepostitService depostitService;


    private CorporateDeposit deposit;

    @Before
    public void setUp() throws Exception {
        deposit=new CorporateDeposit();
    }


    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        deposit.setId(uuidUtil.getUUID());
        deposit.setPid("1");
        deposit.setCapital(new BigDecimal(22));
        deposit.setGetmoney(new BigDecimal(30));
        depostitService.insert(deposit);
    }

    @Test
    public void selectByPrimaryKey() {
        deposit.setId("a4919d6db37445a0953a733b1c1c4499");
        System.out.println( depostitService.selectByPrimaryKey(deposit.getId()));
    }

    @Test
    public void updateByPrimaryKeySelective() {
        deposit.setId("a4919d6db37445a0953a733b1c1c4499");
        deposit.setGetmoney(new BigDecimal(0.5));
        depostitService.updateByPrimaryKeySelective(deposit);
    }

    @Test
    public void listDeposit() {
       deposit.setId("a4919d6db37445a0953a733b1c1c4499");
       deposit.setRangelimit(600);
       depostitService.Update(deposit);
    }
}