package com.mashibing.bridge.example02;

/**
 * 指纹支付
 **/

public class PayFingerPrintMode implements IPayMode{

    @Override
    public boolean security(String uId) {
        System.out.println("指纹支付，风险校验 -> 指纹信息");
        return true;
    }
}
