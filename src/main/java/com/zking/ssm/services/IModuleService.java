package com.zking.ssm.services;

import com.zking.ssm.model.Module;

import java.util.List;

public interface IModuleService {
    //根据用户角色查询出对应的模块权限
    List<Module> listModuleByUserId(String userId);

    //根据模块权限查询出功能权限
    List<Module> listModuleById(int id);
}