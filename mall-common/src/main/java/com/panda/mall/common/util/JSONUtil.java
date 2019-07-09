package com.panda.mall.common.util;


import com.panda.mall.common.client.HttpResponse;

import java.util.Map;

//此类仅仅是为了解决报错，没有实际内容
public class JSONUtil {
    public static String toJSON(Map<String,String> map){
        return "";
    }
    public static String toJSON(HttpResponse response){
        return "";
    }
    public static String toJSON(Object obj){
        return "";
    }
    public static <T> T toObject(String str, Class<T> t){
        return null;
    }
}
