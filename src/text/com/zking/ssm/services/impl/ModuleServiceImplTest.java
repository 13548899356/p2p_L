package com.zking.ssm.services.impl;

import com.zking.ssm.model.Module;
import com.zking.ssm.services.IModuleService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class ModuleServiceImplTest extends BaseTestCase{

    @Autowired
    private IModuleService moduleService;

    private Module m;

    @Before
    public void setUp() throws Exception {
        m=new Module();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void selectByPrimaryKey() {

        List<Module> modules = moduleService.listModuleByUserId(null);
        for (Module module : modules) {
            module.setChildren(moduleService.listModuleById(module.getId()));
        }
        System.out.println(modules);
    }
}