package com.mashibing.bridge;

import com.mashibing.bridge.example01.PayController;
import com.mashibing.bridge.example02.*;
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

    @Test
    public void test02(){

        System.out.println("测试场景1：微信支付，人脸支付方式");
        Pay wxPay=new WxPay(new PayFaceMode());
        wxPay.transfer("wx202303032146001","100090009",new BigDecimal(112.32));
        System.out.println("________________________________________________________________________");
        System.out.println("测试场景1：微信支付，密码支付方式");
        Pay wxPay1 = new WxPay(new PayCypherMode());
        wxPay1.transfer("wx202303032147001","100090010",new BigDecimal(333.00));
        System.out.println("________________________________________________________________________");
        System.out.println("测试场景1：微信支付，指纹支付方式");
        Pay wxPay2 = new WxPay(new PayFingerPrintMode());
        wxPay2.transfer("wx202303032150001","100090011",new BigDecimal("555.99"));

        System.out.println("测试场景1：支付宝支付，人脸支付方式");
        Pay zfbPay=new ZfbPay(new PayFaceMode());
        zfbPay.transfer("wx202303032154001","100090009",new BigDecimal(112.32));
        System.out.println("________________________________________________________________________");
        System.out.println("测试场景1：支付宝支付，密码支付方式");
        Pay zfbPay1 = new ZfbPay(new PayCypherMode());
        wxPay1.transfer("wx202303032156001","100090010",new BigDecimal(333.00));
        System.out.println("________________________________________________________________________");
        System.out.println("测试场景1：支付宝支付，指纹支付方式");
        Pay zfbPay2 = new ZfbPay(new PayFingerPrintMode());
        wxPay2.transfer("wx202303032158001","100090011",new BigDecimal("555.99"));

    }
}
