package com.zking.ssm.controller.back.power;

import com.zking.ssm.model.SysPower;
import com.zking.ssm.services.ISysPowerService;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.util.PinYinUtil;
import com.zking.ssm.util.jsonData;
import com.zking.ssm.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/Power")
public class PowerController {
    @Autowired
    private ISysPowerService sysPowerService;


    @RequestMapping("/doRegister")
    @ResponseBody
    public Object addPower(SysPower sysPower) throws Exception{
        //ID
        sysPower.setPid(uuidUtil.getUUID());

        //时间
        Date date=new Date();     //获取一个Date对象
        SimpleDateFormat simpleDateFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");   //创建一个格式化日期对象
        String time = simpleDateFormat.format(date);   //格式化后的时间
        Date times=simpleDateFormat.parse(time);
        sysPower.setCreatedate(times);

        sysPowerService.doRegister(sysPower);
        return jsonData.toJsonObject(true,"操作员信息增加成功");
    }


    @RequestMapping("/doLogin")
    @ResponseBody
    public Object doLogin(SysPower sysPower){
//        System.out.println(sysPower.getPname()+"================"+sysPower.getPassword());
        SysPower power = sysPowerService.doLogin(sysPower);
        if(power!=null){
            return jsonData.toJsonObject(true,"登录成功");
        }else {
            return jsonData.toJsonObject(false,"登录失败");
        }

    }

    @RequestMapping("/updateByPrimaryKeySelective")
    @ResponseBody
    public Object updateByPrimaryKeySelective(SysPower sysPower){
        System.out.println("updateByPrimaryKeySelective");
        int i = sysPowerService.updateByPrimaryKeySelective(sysPower);
        if(i>0){
           return  jsonData.toJsonObject(true,"修改成功");
        }else {
            return jsonData.toJsonObject(false,"修改失败");
        }

    }

    @RequestMapping("/deleteByPrimaryKey")
    @ResponseBody
    public Object deleteByPrimaryKey(SysPower sysPower){
        System.out.println("deleteByPrimaryKey");
        int Power = sysPowerService.deleteByPrimaryKey(sysPower);
        return jsonData.toJsonObject(true,"删除成功");
    }

    @RequestMapping("/list")
    @ResponseBody
    public Object list(SysPower sysPower,PageBean pageBean){
        System.out.println("list");
        List<SysPower> list = sysPowerService.list(sysPower, pageBean);
        return jsonData.toJsonPager("查询成功",true,pageBean.getTotal(),list);
    }

    @RequestMapping("/selectByPrimaryKey")
    @ResponseBody
    public Object selectByPrimaryKey(SysPower sysPower){
        System.out.println("selectByPrimaryKey");
        SysPower power = sysPowerService.selectByPrimaryKey(sysPower.getPid());
        return jsonData.toJsonObject(true,power);
    }




}
