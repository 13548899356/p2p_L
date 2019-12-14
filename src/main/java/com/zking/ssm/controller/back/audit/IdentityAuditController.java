package com.zking.ssm.controller.back.audit;

import com.zking.ssm.model.IdentityAudit;
import com.zking.ssm.services.IdentityAuditService;
import com.zking.ssm.util.jsonData;
import com.zking.ssm.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;

@Controller
@RequestMapping("/IdentityAudit")
public class IdentityAuditController  {

    @Autowired
        private IdentityAuditService auditService;


    @RequestMapping("/uploadIdentity")
//    @ResponseBody
    public Object uploadIdentity(MultipartFile[] imgs, HttpServletResponse response)throws Exception{
        for(int i=0;i<imgs.length;i++){
//            imgA=imgs[0].getOriginalFilename();
//            imgB=imgs[0].getOriginalFilename();
//            System.out.println(imgs[i].getOriginalFilename().toString());
            String realPath="D:\\T228\\HBulide数据\\Vue\\p2p_project\\src\\assets\\indentityImg\\"+imgs[i].getOriginalFilename();
            try {
                File file=new File(realPath);
                imgs[i].transferTo(file);

            }catch (Exception e){
                return jsonData.toJsonMessage("头像修改失败",false);
            }

        }
        response.sendRedirect("http://localhost:8083/#/realName");
        return null;
    }


    @RequestMapping("/addAudit")
    @ResponseBody
    public Object addAudit(IdentityAudit identityAudit){
//        identityAudit.setImage1(imgA);
//        identityAudit.setImage2(imgB);
//        System.out.println(identityAudit);
        identityAudit.setId(uuidUtil.getUUID());
        int i = auditService.insertSelective(identityAudit);
        if(i>0){
            return jsonData.toJsonMessage("认证上传成功",true);
        }else{
            return jsonData.toJsonMessage("认证上传成功",false);
        }

    }

    @RequestMapping("/loadIdentity")
    @ResponseBody
    public Object loadIdentity(String uid){
        IdentityAudit identityAudit = auditService.selectByPrimaryKey(uid);
        if(identityAudit!=null){
            return jsonData.toJsonObject(true,identityAudit);
        }else{
            return  jsonData.toJsonObject(false,"");
        }


    }





}
