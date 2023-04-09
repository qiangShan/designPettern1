package com.mashibing.strategy.example03;

import com.mashibing.strategy.example02.Receipt;

/**
 * 回执处理策略接口
 * */

public interface ReceiptHandlerStrategy {

    public void handlerReceipt(Receipt receipt);
}
