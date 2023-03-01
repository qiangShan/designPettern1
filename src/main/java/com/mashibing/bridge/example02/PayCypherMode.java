package com.mashibing.bridge.example02;

/**
 * 密码支付
 * */

public class PayCypherMode implements IPayMode{


    @Override
    public boolean security(String uId) {
        System.out.println("密码支付，风控校验 -->环境安全");
        return true;
    }
}
