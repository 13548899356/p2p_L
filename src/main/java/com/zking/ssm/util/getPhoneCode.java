package com.zking.ssm.util;

import org.apache.http.HttpResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

//获取手机验证码通用类
public class getPhoneCode {

    public static String getCode(String phone){
        String host = "http://dingxin.market.alicloudapi.com";
        String path = "/dx/sendSms";
        String method = "POST";
        String appcode = "00025b5eedf445bf9c208b14bd2b8455";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("mobile", phone);
        //        验证码 随机。
        Random random=new Random();
        int a=random.nextInt(1000000);
        querys.put("param", "code:"+a);
        querys.put("tpl_id", "TP1711063");
        Map<String, String> bodys = new HashMap<String, String>();
        try {

            HttpResponse response = HttpUtils.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());
            //获取response的body
            //System.out.println(EntityUtils.toString(response.getEntity()));
        } catch (Exception e) {
            e.printStackTrace();
        }
        //获取随机的验证码
        return a+"";
    }

}
