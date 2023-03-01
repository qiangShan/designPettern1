package com.mashibing.bridge.example02;


/**
 * 支付模式接口
 * */

public interface IPayMode {

    //安全校验功能：对各种支付模式进行校验操作
    public boolean security(String uId);
}
