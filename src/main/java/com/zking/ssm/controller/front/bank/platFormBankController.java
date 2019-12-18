package com.zking.ssm.controller.front.bank;

import com.zking.ssm.model.platFormBankInfo;
import com.zking.ssm.services.IplatFormBankInfoService;
import com.zking.ssm.util.ThreeIdentity;
import com.zking.ssm.util.jsonData;
import com.zking.ssm.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/bankInfo")
public class platFormBankController {

    @Autowired
    private IplatFormBankInfoService bankInfoService;


    @RequestMapping("/addBankInfo")
    @ResponseBody
    public Object addBankInfo(platFormBankInfo bankInfo) throws Exception{
        bankInfo.setId(uuidUtil.getUUID());
        System.out.println(bankInfo);
        String url = "http://bankcard3c.shumaidata.com/bankcard3c";
        String appCode = "545f91cd0fbd4fa48692740d8d5121f4";

        Map<String, String> params = new HashMap<>();
        params.put("idcard", bankInfo.getIdentity());
        params.put("name", bankInfo.getAccountname());
        params.put("bankcard", bankInfo.getIdcard());
        for(String key:params.keySet()){
            String value = params.get(key).toString();//
            System.out.println("key:"+key+" vlaue:"+value);
        }

        String result = ThreeIdentity.get(appCode,url,params).toString();

        //假设，400是正确的，因为200要扣我钱
        if(result.equals("200")){
            //说明三要素认证成功
            System.out.println(bankInfo);
            int i = bankInfoService.insertSelective(bankInfo);
            if(i>0){
                return jsonData.toJsonMessage("银行卡绑定成功",true);
            }else{
                return jsonData.toJsonMessage("",false);
            }
        }else{
            return jsonData.toJsonMessage("",false);
        }

//        System.out.println(result);
    }



    @RequestMapping("/loadBankInfo")
    @ResponseBody
    public  Object loadBankInfo(platFormBankInfo bankInfo){
        System.out.println(bankInfo);
        List<platFormBankInfo> platFormBankInfos = bankInfoService.selectByPrimaryKey(bankInfo);

        return jsonData.toJsonObject(true,platFormBankInfos);
//        return "aaaa";
    }





}
