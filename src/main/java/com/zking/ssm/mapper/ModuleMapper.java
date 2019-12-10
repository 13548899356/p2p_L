package com.zking.ssm.mapper;

import com.zking.ssm.model.Module;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ModuleMapper {

    //根据用户角色查询出对应的模块权限
    List<Module> listModuleByUserId(String userId);

    //根据模块权限查询出功能权限
    List<Module> listModuleById(int id);


}