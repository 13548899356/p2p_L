package com.zking.ssm.util;


import java.util.HashMap;
import java.util.Map;

public class jsonData {



   //将验证信息转为json
    public static Map toJsonMessage(String msg,boolean success){
        Map<String,Object> map=new HashMap<>();
        map.put("msg",msg);
        map.put("success",success);
        return map;
    }

    //将查询分页数据转为json
    public static Map toJsonPager(String msg,boolean success,int total,Object data){
        Map<String,Object> json=new HashMap<>();
        json.put("msg", msg);
        json.put("success", success);
        json.put("total", total);
        json.put("data", data);
        return json;
    }

    //
    public static Map toJsonObject(boolean success,Object data){
        Map<String,Object> json=new HashMap<>();
        json.put("success", success);
        json.put("data", data);
        return json;
    }




}
