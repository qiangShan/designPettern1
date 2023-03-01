package com.mashibing.bridge;

import com.mashibing.bridge.example01.PayController;
import org.junit.Test;

import java.math.BigDecimal;

public class Test_Pay {

    @Test
    public void test01(){
        PayController payController = new PayController();

        System.out.println("测试：微信支付--->人脸支付");
        payController.doPay("wx202303022252","100010000",new BigDecimal(100),1,2);
        System.out.println("");
        System.out.println("测试：支付宝支付--->指纹支付");
        payController.doPay("zfb202303022254","100010001",new BigDecimal(239.09),2,3);
    }
}
