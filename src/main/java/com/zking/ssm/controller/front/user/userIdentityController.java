package com.zking.ssm.controller.front.user;

import com.zking.ssm.model.UserAccount;
import com.zking.ssm.model.sysUser;
import com.zking.ssm.model.userIdentity;
import com.zking.ssm.services.ISysUserService;
import com.zking.ssm.services.IUserAccountService;
import com.zking.ssm.services.IuserIdentityService;
import com.zking.ssm.shiro.PasswordHelper;
import com.zking.ssm.util.*;
import org.apache.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping("/userIndentity")
public class userIdentityController {

//    设置验证码有效时间



    @Autowired
    private IuserIdentityService identityService;
    @Autowired
    private ISysUserService userService;
    @Autowired
    private IUserAccountService accountService;



    String uid, code;

    @RequestMapping("/phoneLogin")
    //获取短信验证码
    public Object getCode(userIdentity identity) {
        //获取手机号码
        uid=null;
        String phone = identity.getPhone();
        code = getPhoneCode.getCode(phone);
        userIdentity identity1 = identityService.getIdentity(identity);
        System.out.println(identity1);
        uid = identity1.getUid();

        return null;
    }

    @RequestMapping("/goPhoneLogin")
    @ResponseBody
    public Object goPhoneLogin(String codes, PageBean pageBean) {
        if (codes == code || codes.equals(code)) {
            //代表验证码输入正确
            sysUser user = new sysUser();
            user.setUid(uid);
            System.out.println(user);
            try {
                List<sysUser> listUser = userService.getListUser(user,pageBean);

                    uid=null;
                    return jsonData.toJsonObject(true, listUser.get(0));

            } catch (Exception e) {
                return jsonData.toJsonMessage("手机号未绑定任何账号", false);
            }

        } else {
            return jsonData.toJsonMessage("验证码输入错误", false);
        }

    }

//    =======================注册模块，相关信息的添加与绑定=====================================

    @RequestMapping("/addPhone")
    public Object addPhone(userIdentity identity) {
        System.out.println(identity);
            String code1 = getPhoneCode.getCode(identity.getPhone());
            code=code1;
            return null;

    }


    @RequestMapping("/verifyCode")
    @ResponseBody
    public Object verifyCode(String codes,userIdentity identity){
        //判断验证码是否输入正确
        if (codes == code || codes.equals(code)) {
            //1.判断该手机号是否已被注册
            userIdentity identity1 = identityService.getIdentity(identity);
            if(null==identity1){
                //未被注册
                return jsonData.toJsonMessage("",true);
            }else{
                //已被注册
                return jsonData.toJsonMessage("手机号已被注册",true);
            }
        }else{
            return jsonData.toJsonMessage("验证码输入错误",false);
        }
    }

    //验证账号是否已被注册
    @RequestMapping("/verifyUserName")
    @ResponseBody
    public Object verifyUserName(sysUser user){
        sysUser user1 = userService.getUser(user);
        if(null!=user1){
            return jsonData.toJsonMessage("该账户已存在，请切换",true);
        }else{
            return jsonData.toJsonMessage("",false);
        }

    }

    //注册新账号
    @RequestMapping("/newAccount")
    @ResponseBody
    public Object newAccount(String phone,boolean update,sysUser user){
        System.out.println(phone);
        if(update){
            //解除绑定

        identityService.updateIdentity(phone);
        }
            //添加绑定
            String id=uuidUtil.getUUID();
            String uid=uuidUtil.getUUID();
        //添加用户
            String salt = PasswordHelper.createSalt();
            //凭证+盐加密后得到的密码
            String password = PasswordHelper.createCredentials(user.getPassword(), salt);
            user.setUid(uid);
            user.setPassword(password);
            user.setSalt(salt);
            userService.doRegister(user);
            userIdentity identity=new userIdentity();
            identity.setId(id);
            identity.setUid(uid);
            identity.setPhone(phone);
            identityService.insert(identity);
            UserAccount userAccount=new UserAccount();
            userAccount.setId(uuidUtil.getUUID());
            userAccount.setUid(uid);
            accountService.insertSelective(userAccount);


        return jsonData.toJsonMessage("用户注册成功",true);
    }


    //查询用户个人认证情况信息
    @RequestMapping("/lookUserIdentity")
    @ResponseBody
    public Object lookUserIdentity(userIdentity identity){
        System.out.println(identity);
        userIdentity identity1 = identityService.getIdentity(identity);
        if(null!=identity1){
            return jsonData.toJsonObject(true,identity1);
        }else{
            return jsonData.toJsonObject(false,null);
        }
    }

    //修改个人对应信息
    @RequestMapping("/updateIdentity")
    @ResponseBody
    public Object updateIdentity(userIdentity identitys){
        int i = identityService.updateIdentitySelectKey(identitys);
        if(i>0){
           return jsonData.toJsonMessage("ok",true);
        }else{
           return jsonData.toJsonMessage("no",false);
        }
    }

}
