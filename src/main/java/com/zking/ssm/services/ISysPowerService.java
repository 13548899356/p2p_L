package com.zking.ssm.services;

import com.zking.ssm.model.SysPower;
import com.zking.ssm.util.PageBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ISysPowerService {
    //注册
    int doRegister(SysPower sysPower);
    //登录
    SysPower doLogin(SysPower sysPower);
    //修改个人全部信息
    int updateByPrimaryKey(SysPower sysPower);
    //选择型修改个人信息 单个修改
    int updateByPrimaryKeySelective(SysPower sysPower);
    //查看所有的员工并进行分页  还可以根据员工昵称模糊查询
    List<SysPower> list(SysPower sysPower, PageBean pageBean);
    //删除一个员工
    int deleteByPrimaryKey(SysPower sysPower);
    //查看单个员工
    SysPower selectByPrimaryKey(String pid);

    int insertSelective(SysPower sysPower);

}
