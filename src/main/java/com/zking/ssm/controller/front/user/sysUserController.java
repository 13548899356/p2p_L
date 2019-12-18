package com.zking.ssm.controller.front.user;

import com.zking.ssm.model.sysUser;
import com.zking.ssm.services.ISysUserService;
import com.zking.ssm.util.jsonData;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sysUser")
public class sysUserController {

    @Autowired
    private ISysUserService userService;

//    @RequestMapping("/userLogin")
//    @ResponseBody
//    public Object userLogin(sysUser user){
//        sysUser users = userService.getUser(user);
//        if(null==user){
//            return jsonData.toJsonMessage("",false);
//        }else{
//            return jsonData.toJsonObject(true,users);
//        }
//
//    }


    @RequestMapping("/userLogin")
    @ResponseBody
    public Object userLogin(sysUser user){
        String userName=user.getUname();
        String password=user.getPassword();

        //获取主体
        Subject subject=SecurityUtils.getSubject();
        //创建用户和密码的令牌
        UsernamePasswordToken token=new UsernamePasswordToken(userName,password);
        //获取错误信息
        String message=null;
        try {
            subject.login(token);
        } catch (IncorrectCredentialsException e) {
            message = "密码错误";
//            e.printStackTrace();
        } catch (UnknownAccountException e) {
            message = "账户错误";
//            e.printStackTrace();
        } catch (Exception e) {
            message = "其他错误";
//            e.printStackTrace();
        }
        if(null==message){
            //代表登录成功
            sysUser users = userService.getUser(user);
            return jsonData.toJsonObject(true,users);
        }else{
            return jsonData.toJsonMessage(message,false);
        }

    }

//    身份验证失败
    @RequestMapping("/loser")
    public Object loser(){
        System.out.println("身份验证失败");
        return null;
    }

//    身份验证成功
    @RequestMapping("/success")
    public Object success(){
        System.out.println("身份验证成功");
        return null;
    }


}
