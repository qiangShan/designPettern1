package com.mashibing.bridge.example02;

import java.math.BigDecimal;

/**
 * 支付抽象类
 * */

public abstract class Pay {

    //桥接对象
    protected IPayMode iPayMode;

    public Pay(IPayMode iPayMode) {
        this.iPayMode = iPayMode;
    }

    //划账
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
