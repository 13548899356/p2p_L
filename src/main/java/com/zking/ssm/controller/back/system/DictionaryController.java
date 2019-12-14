package com.zking.ssm.controller.back.system;

import com.zking.ssm.model.Dictionary;
import com.zking.ssm.model.sysUser;
import com.zking.ssm.services.IDictionaryService;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.util.jsonData;
import com.zking.ssm.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/diction")
public class DictionaryController {

    @Autowired
    private IDictionaryService dictionaryService;


//    private PageBean pageBean;

    @ModelAttribute
    public void init(){


        System.out.println("init");
    }

    @RequestMapping("/load")
    @ResponseBody
    public Object load(Dictionary dictionary,PageBean pageBean){
        System.out.println(pageBean);
//        PageBean pageBean=new PageBean();
        List<Dictionary> dictionaries = dictionaryService.DictionaryList(dictionary,pageBean);
        return jsonData.toJsonPager("",true,pageBean.getTotal(),dictionaries);
    }

    @RequestMapping("/TypeList")
    @ResponseBody
    public Object TypeList(){
        List<Object> dictionaries = dictionaryService.TypeList();
        return jsonData.toJsonObject(true,dictionaries);
    }



    @RequestMapping("/add")
    @ResponseBody
    public Object add(Dictionary dictionary){
        dictionary.setId(uuidUtil.getUUID());
        int n = dictionaryService.insert(dictionary);
        return jsonData.toJsonObject(true,n);
//        return null;
    }

    @RequestMapping("/update")
    @ResponseBody
    public Object update(Dictionary dictionary){
        int n = dictionaryService.updateByPrimaryKeySelective(dictionary);
        return jsonData.toJsonObject(true,n);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Object delete(Dictionary dictionary){
        int n = dictionaryService.deleteByPrimaryKey(dictionary);
        return jsonData.toJsonObject(true,n);
    }







}
