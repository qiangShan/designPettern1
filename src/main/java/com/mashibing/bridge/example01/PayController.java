package com.mashibing.bridge.example01;

import java.math.BigDecimal;

/**
 * 支付接口
 * */

public class PayController {

    /**
     * 支付功能
     * @param uId  用户ID
     * @param tradeId  交易ID
     * @param amount   交易金额
     * @param channelType  渠道类型  1 微信  2 支付宝
     * @param modeType   支付类型   1 密码  2 人脸  3 指纹
     * @return  boolean
     * */

    public boolean doPay(String uId, String tradeId, BigDecimal amount, Integer channelType, Integer modeType){

        //微信支付
        if(channelType == 1){

            System.out.println("微信渠道支付开始 .......");
            if(modeType == 1){
                System.out.println("密码支付");
            }else if(modeType == 2){
                System.out.println("人脸支付");
            }else if(modeType== 3){
                System.out.println("指纹支付");
            }else{
                System.out.println("支付失败，请重新支付");
            }
            System.out.println("微信渠道支付结束");

        }

        //支付宝支付
        if(channelType == 2){

            System.out.println("支付宝渠道支付开始 .......");
            if(modeType == 1){
                System.out.println("密码支付");
            }else if(modeType == 2){
                System.out.println("人脸支付");
            }else if(modeType== 3){
                System.out.println("指纹支付");
            }else{
                System.out.println("支付失败，请重新支付");
            }
            System.out.println("支付宝渠道支付结束");

        }

        return true;
    }
}
