package com.zking.ssm.controller.back.audit;

import com.zking.ssm.model.IdentityAudit;
import com.zking.ssm.model.sysUser;
import com.zking.ssm.services.ISysUserService;
import com.zking.ssm.services.IdentityAuditService;
import com.zking.ssm.util.HttpUtils;
import com.zking.ssm.util.PageBean;
import com.zking.ssm.util.jsonData;
import com.zking.ssm.util.uuidUtil;
import jdk.management.resource.internal.inst.NetRMHooks;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/IdentityAudit")
public class IdentityAuditController  {

    @Autowired
        private IdentityAuditService auditService;
    @Autowired
    private ISysUserService userService;


//多文件上传
    @RequestMapping("/uploadIdentity")
    @ResponseBody
    public Object uploadIdentity(MultipartFile[] imgs, HttpServletResponse response)throws Exception{
        for(int i=0;i<imgs.length;i++){
            String realPath="D:\\T228\\HBulide数据\\Vue\\p2p_project\\src\\assets\\indentityImg\\"+imgs[i].getOriginalFilename();
            try {
                File file=new File(realPath);
                imgs[i].transferTo(file);
            }catch (Exception e){
                response.sendRedirect("http://localhost:8083/#/realName");
                return jsonData.toJsonMessage("失败",false);
            }
//
        }
        response.sendRedirect("http://localhost:8083/#/realName");
        uploadIdentity2(imgs);
        return null;
    }
//    @RequestMapping("/uploadIdentity2")
    public  void uploadIdentity2(MultipartFile[] imgs)throws Exception{
        System.out.println(imgs);
        for(int i=0;i<imgs.length;i++){
            String realPath2="D:\\T228\\HBulide数据\\Vue\\p2p_back\\src\\assets\\identityImg\\"+imgs[i].getOriginalFilename();
            try {
                File file=new File(realPath2);
                imgs[i].transferTo(file);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    //添加认证
    @RequestMapping("/addAudit")
    @ResponseBody
    public Object addAudit(IdentityAudit identityAudit){
        identityAudit.setId(uuidUtil.getUUID());
        int i = auditService.insertSelective(identityAudit);
        if(i>0){
            return jsonData.toJsonMessage("认证上传成功",true);
        }else{
            return jsonData.toJsonMessage("认证上传成功",false);
        }

    }

    //加载个人认证信息
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

    //加载所有认证信息
    @RequestMapping("/loadAllIdentity")
    @ResponseBody
    public Object loadAllIdentity(IdentityAudit identityAudit, PageBean pageBean){
        List<IdentityAudit> identityAudits = auditService.listIdentity(identityAudit,pageBean);
        for (IdentityAudit audit : identityAudits) {
            sysUser user= new sysUser();
            user.setUid(audit.getUid());
            audit.setSysUsers(userService.getListUser(user,pageBean));
        }

        return jsonData.toJsonPager("",true,identityAudits.size(),identityAudits);
    }

    //修改认证信息
    @RequestMapping("/updateIdentity")
    @ResponseBody
    public Object updateIdentity(IdentityAudit identityAudit) {
        int i = auditService.updateByPrimaryKeySelective(identityAudit);
        if(i>0){
            return jsonData.toJsonMessage("信息反馈成功",true);
        }else{
            return jsonData.toJsonMessage("信息反馈失败",false);
        }
    }

    //姓名身份证二要素认证
    @RequestMapping("/identityTwo")
    @ResponseBody
    public Object identotyTwo(IdentityAudit identityAudit) throws Exception{
        String host = "https://idcert.market.alicloudapi.com";
        String path = "/idcard";
        String method = "GET";
        String appcode = "545f91cd0fbd4fa48692740d8d5121f4";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("idCard",identityAudit.getIdentity());
        querys.put("name", identityAudit.getUname());
        HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);

        return jsonData.toJsonObject(true, EntityUtils.toString(response.getEntity()));
    }



}
