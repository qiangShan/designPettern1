package com.mashibing.strategy.example03;

import com.mashibing.strategy.example02.Receipt;

/**
 * 具体策略类
 * */

public class MT1101ReceiptHandlerStrategy implements ReceiptHandlerStrategy{
    @Override
    public void handlerReceipt(Receipt receipt) {
        System.out.println("解析报文MT1101:"+receipt.getMessage());
    }
}
