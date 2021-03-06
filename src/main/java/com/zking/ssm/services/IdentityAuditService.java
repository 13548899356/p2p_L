package com.zking.ssm.services;

import com.zking.ssm.model.IdentityAudit;
import com.zking.ssm.util.PageBean;

import java.util.List;


public interface IdentityAuditService {
    int deleteByPrimaryKey(String id);

    int insert(IdentityAudit record);

    int insertSelective(IdentityAudit record);

    IdentityAudit selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IdentityAudit record);

    int updateByPrimaryKey(IdentityAudit record);

    List<IdentityAudit> listIdentity(IdentityAudit audit, PageBean pageBean);
}