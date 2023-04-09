package com.mashibing.chain.example02;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * 模拟审核服务
 * */

public class AuthService {

    //审核信息容器 key:审批人ID+审批单ID,value:审批时间
    private static Map<String, Date> outMap=new HashMap<>();

    /**
     * 审核方法
     * @param uId 审核人ID
     * @param orderId  审核单ID
     *
     * */
    public static void auth(String uId,String orderId){
        System.out.println("进入审批流程，审批人ID："+uId);
        outMap.put(uId.concat(orderId), new Date());
    }

    //查询审核结果
    public static Date queryAuthInfo(String uId,String orderId){
        return outMap.get(uId.concat(orderId));
    }
}
