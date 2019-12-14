package com.zking.ssm.services;

import com.zking.ssm.model.Dictionary;
import com.zking.ssm.services.impl.BaseTestCase;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.util.uuidUtil;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DictionaryServiceTest extends BaseTestCase{
    @Autowired
    private IDictionaryService dictionaryService;

    private Dictionary dictionary;
    private PageBean pageBean;
    private uuidUtil uid;

    @Before
    public void setUp() throws Exception {
        dictionary=new Dictionary();
        pageBean=new PageBean();
        uid=new uuidUtil();

    }


    @Test
    public void deleteByPrimaryKey() {
        dictionary.setId("26");
        dictionaryService.deleteByPrimaryKey(dictionary);
    }

    @Test
    public void insert() {
//        dictionary.setId(20);
        dictionary.setId(uuidUtil.getUUID());
        dictionary.setDicttype("用户平台管理");
        dictionary.setDictitem("已锁定");
        dictionary.setDictvalue("1");
        dictionary.setDictiseditable(0);//不可编辑
        dictionaryService.insert(dictionary);
    }

    @Test
    public void selectByPrimaryKey() {
        dictionary.setId("25");
        Dictionary dictionary = dictionaryService.selectByPrimaryKey(this.dictionary);
        System.out.println(dictionary);
    }

    @Test
    public void updateByPrimaryKeySelective() {
        dictionary.setId("25");
        dictionary.setDicttype("用户平台");
        dictionaryService.updateByPrimaryKeySelective(dictionary);
    }

    @Test
    public void dictionaryList() {
//        dictionary.setDicttype("用户");
        List<Dictionary> dictionaries = dictionaryService.DictionaryList(dictionary,pageBean);
        System.out.println(pageBean.getTotal());
        for (Dictionary d:dictionaries) {
            System.out.println(d);
        }

    }

    @Test
    public void TYpeList() {
        List<Object> list = dictionaryService.TypeList();
        for (Object d:list) {
            System.out.println(d);
        }
    }


}