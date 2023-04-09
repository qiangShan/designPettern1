package com.mashibing.chain.example02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 审核申请接口
 * */

public class AuthController {


    /**
     * 审核方法
     * @param name 申请人姓名
     * @param orderId 申请单ID
     * @param authDate  申请时间
     *
     * */
    public AuthInfo doAuth(String name, String orderId, Date authDate) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        //三级审核
        Date date=null;

        //查询是否存在审核信息，虚拟三级审核人ID：1000013
        date=AuthService.queryAuthInfo("1000013",orderId);
        if(date == null){
            return new AuthInfo("0001","单号:"+orderId,
                    "状态：等待三级审批负责人进行审批");
        }
        /**
         *  二级审核
         *  查询是否存在审核信息，虚拟二级审核人ID：1000012
         *  二级审核人审核申请单的时间为：04-11 ～04-30
         * */
        if(authDate.after(sdf.parse("2023-04-01 00:00:00")) && authDate.before(sdf.parse("2023-05-01 00:00:00"))){
            date=AuthService.queryAuthInfo("1000012","orderId");
            if(date == null){
                return new AuthInfo("0001","单号:"+orderId,
                        "状态：等待二级审批负责人进行审批");
            }
        }

        /**
         *  一级审核
         *  查询是否存在审核信息，虚拟二级审核人ID：1000011
         *  一级审核人审核申请单的时间为：04-11 ～04-30
         * */
        if(authDate.after(sdf.parse("2023-05-30 00:00:00")) && authDate.before(sdf.parse("2023-06-01 00:00:00"))){
            date=AuthService.queryAuthInfo("1000011","orderId");
            if(date == null){
                return new AuthInfo("0001","单号:"+orderId,
                        "状态：等待一级审批负责人进行审批");
            }
        }

        return  new AuthInfo("0001"+"单号："+orderId,"申请人:"+name+"状态：审批完成");
    }
}
