package com.zking.ssm.controller.front.user;

import com.zking.ssm.model.MoneyRecord;
import com.zking.ssm.services.IMoneyRecordService;
import com.zking.ssm.util.jsonData;
import com.zking.ssm.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/MoneyRecord")
    public class MoneyRecordController {

    @Autowired
    private IMoneyRecordService recordService;

    @RequestMapping("/addMoneyRecord")
    @ResponseBody
    public Object addMoneyRecord(MoneyRecord moneyRecord){
        moneyRecord.setId(uuidUtil.getUUID());
        int i = recordService.insertSelective(moneyRecord);
        if(i>0){
            return jsonData.toJsonMessage("添加成功",true);
        }else{
            return jsonData.toJsonMessage("添加失败",false);
        }
    }


    //查询单个用户的贷款信息
    @RequestMapping("/getMoneyRecord")
    @ResponseBody
    public Object getMoneyRecord(MoneyRecord moneyRecord){
        System.out.println("==============================================");
        System.out.println(moneyRecord.getUid());
        MoneyRecord moneyRecord1 = recordService.selectByPrimaryKey(moneyRecord.getUid());
        return jsonData.toJsonObject(true,moneyRecord1);
    }



}
