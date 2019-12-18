package com.zking.ssm.controller.front.user;

import com.zking.ssm.model.UserAccount;
import com.zking.ssm.services.IUserAccountService;
import com.zking.ssm.util.jsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
@RequestMapping("/userAccount")
public class userAccountController {

    @Autowired
    private IUserAccountService userAccountService;

    private UserAccount userAccount;

    @ModelAttribute
    public void init(){

    }
    @RequestMapping("/getUserAccount")
    @ResponseBody
    public Object getUserAccount(String uid){
        UserAccount userAccount = userAccountService.selectByPrimaryKey(uid);
        if(userAccount!=null){
            return jsonData.toJsonObject(true,userAccount);
        }else{
            return jsonData.toJsonMessage("查无此人",false);
        }

    }



    @RequestMapping("/getUploadImg")
    @ResponseBody
    public Object getUploadImg(UserAccount userAccount, HttpServletRequest request,HttpServletResponse response){
        System.out.println("获取文件上传的路径");

//        //将相对路径转化为绝对路径
        String realPath="D:\\T228\\HBulide数据\\Vue\\p2p_project\\src\\assets\\uploads\\"+userAccount.getImgName().getOriginalFilename();
        try {
            //上传
            userAccount.getImgName().transferTo(new File(realPath));
            userAccount.setPhoto(userAccount.getImgName().getOriginalFilename());
            System.out.println(userAccount);
            int i = userAccountService.updateByPrimaryKeySelective(userAccount);
            if(i>0){
                response.sendRedirect("http://localhost:8083/#/AccountOverview");
                return jsonData.toJsonMessage("头像修改成功",true);
            }else {
                return jsonData.toJsonMessage("文件上传成功", true);

            }
        }catch (Exception e){
            return jsonData.toJsonMessage("头像修改失败",false);
        }


    }


    @RequestMapping("/updateAccount")
    @ResponseBody
    public  Object updateAccount(UserAccount userAccount){
        int i = userAccountService.updateByPrimaryKeySelective(userAccount);
        if(i>0){
            return jsonData.toJsonMessage("ok",true);
        }else{
            return jsonData.toJsonMessage("no",false);
        }
    }

}
