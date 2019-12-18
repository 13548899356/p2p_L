package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.IdentityAuditMapper;
import com.zking.ssm.model.IdentityAudit;
import com.zking.ssm.services.IdentityAuditService;
import com.zking.ssm.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentityAuditServiceImpl implements IdentityAuditService {

    @Autowired
    private IdentityAuditMapper identityAuditMapper;

    @Override
    public int deleteByPrimaryKey(String id) {
        return identityAuditMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(IdentityAudit record) {
        return identityAuditMapper.insert(record);
    }

    @Override
    public int insertSelective(IdentityAudit record) {
        return identityAuditMapper.insertSelective(record);
    }

    @Override
    public IdentityAudit selectByPrimaryKey(String id) {
        return identityAuditMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(IdentityAudit record) {
        return identityAuditMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(IdentityAudit record) {
        return identityAuditMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<IdentityAudit> listIdentity(IdentityAudit audit, PageBean pageBean) {
        return identityAuditMapper.listIdentity(audit);
    }
}
