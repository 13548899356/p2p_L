package com.zking.ssm.controller.front.message;

import com.zking.ssm.model.SystemMessage;
import com.zking.ssm.services.ISystemMessageService;
import com.zking.ssm.util.jsonData;
import com.zking.ssm.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/systemMessage")
public class systemMessageController {

    @Autowired
    private ISystemMessageService messageService;


    @RequestMapping("/getMessageByUser")
    @ResponseBody
    public Object getMessageByUser(SystemMessage message) {
        System.out.println(message);
        List<SystemMessage> systemMessages = messageService.selectByPrimaryKey(message.getUid());
        if (systemMessages != null) {
            return jsonData.toJsonPager("",true,systemMessages.size(),systemMessages);
        } else {
            return jsonData.toJsonMessage("",false);
        }
    }

    @RequestMapping("/addMessageByUser")
    @ResponseBody
    public Object addMessageByUser(SystemMessage systemMessage){
        System.out.println(systemMessage);
        systemMessage.setId(uuidUtil.getUUID());
        int i = messageService.insertSelective(systemMessage);
        if(i>0){
          return  jsonData.toJsonMessage("信息反馈成功",true);
        }else{
          return  jsonData.toJsonMessage("信息反馈失败",false);
        }

    }

    //删除系统信息
    @RequestMapping("/delSystemMessage")
    @ResponseBody
    public Object delMessage(String id){
        int i = messageService.deleteByPrimaryKey(id);
        if(i>0){
            return jsonData.toJsonMessage("ok",true);
        }else{
            return jsonData.toJsonMessage("no",false);
        }
    }


}
