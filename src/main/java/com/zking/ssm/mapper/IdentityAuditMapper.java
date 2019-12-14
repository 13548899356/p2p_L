package com.zking.ssm.mapper;

import com.zking.ssm.model.IdentityAudit;

public interface IdentityAuditMapper {
    int deleteByPrimaryKey(String id);

    int insert(IdentityAudit record);

    int insertSelective(IdentityAudit record);

    IdentityAudit selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(IdentityAudit record);

    int updateByPrimaryKey(IdentityAudit record);
}