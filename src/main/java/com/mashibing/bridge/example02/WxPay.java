package com.mashibing.bridge.example02;

/**
 * 微信支付
 * */

import java.math.BigDecimal;

public class WxPay extends Pay{

    public WxPay(IPayMode iPayMode) {
        super(iPayMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        System.out.println("微信渠道支付划账开始.......");
        boolean security = iPayMode.security(uId);
        System.out.println("微信渠道支付风险校验:"+uId+","+tradeId+","+security);

        if(!security){
            System.out.println("微信渠道支付划账失败！");
            return "500";
      }

        System.out.println("微信渠道划账成功，金额："+amount);
        return "200";
    }
}
