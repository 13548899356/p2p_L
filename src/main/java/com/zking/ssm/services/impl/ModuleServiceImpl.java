package com.zking.ssm.services.impl;

import com.zking.ssm.mapper.ModuleMapper;
import com.zking.ssm.model.Module;
import com.zking.ssm.services.IModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModuleServiceImpl implements IModuleService {
    @Autowired
    private ModuleMapper moduleMapper;


    @Override
    public List<Module> listModuleByUserId(String userId) {
        return moduleMapper.listModuleByUserId(userId);
    }

    @Override
    public List<Module> listModuleById(int id) {
        return moduleMapper.listModuleById(id);
    }
}
