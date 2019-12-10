package com.zking.ssm.util;

import java.util.UUID;

public  class uuidUtil {

    //获取uuid的方法
    public static String getUUID(){
        String uuid= UUID.randomUUID().toString().replace("-","");

        return uuid;
    }


}
