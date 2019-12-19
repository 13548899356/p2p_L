package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.SysPowerMapper;
import com.zking.ssm.model.SysPower;
import com.zking.ssm.services.ISysPowerService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysPowerServiceImpl implements ISysPowerService {

    @Autowired
    private SysPowerMapper sysPowerMapper;

    public SysPowerServiceImpl() {
    }

    @Override
    public int doRegister(SysPower sysPower) {
        return sysPowerMapper.doRegister(sysPower);
    }

    @Override
    public SysPower doLogin(SysPower sysPower) {
        return sysPowerMapper.doLogin(sysPower);
    }

    @Override
    public int updateByPrimaryKey(SysPower sysPower) {
        return sysPowerMapper.updateByPrimaryKey(sysPower);
    }

    @Override
    public int updateByPrimaryKeySelective(SysPower sysPower) {
        return sysPowerMapper.updateByPrimaryKeySelective(sysPower);
    }

    /**
     * 查询所有并分页
     * @param sysPower
     * @return
     */
    @Override
    public List<SysPower> list(SysPower sysPower, PageBean pageBean) {
        List<SysPower> list = this.sysPowerMapper.list(sysPower);
//        System.out.println(list.getClass());
        return list;
    }

    @Override
    public int deleteByPrimaryKey(SysPower sysPower) {
        return sysPowerMapper.deleteByPrimaryKey(sysPower.getPid());
    }

    @Override
    public SysPower selectByPrimaryKey(String pid) {
        return sysPowerMapper.selectByPrimaryKey(pid);
    }

    @Override
    public int insertSelective(SysPower sysPower) {
        return sysPowerMapper.insertSelective(sysPower);
    }

}
