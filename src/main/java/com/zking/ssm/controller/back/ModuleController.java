package com.zking.ssm.controller.back;

import com.zking.ssm.model.Module;
import com.zking.ssm.services.IModuleService;
import com.zking.ssm.util.jsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/module")
public class ModuleController {

    @Autowired
    private IModuleService moduleService;



    @RequestMapping("getModule")
    @ResponseBody
    public Object getModule(){
        System.out.println("111111111111111");
        List<Module> modules = moduleService.listModuleByUserId(null);
        for (Module module : modules) {
            module.setChildren(moduleService.listModuleById(module.getId()));
        }
        return jsonData.toJsonObject(true,modules);
    }



}
