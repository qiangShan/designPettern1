package com.mashibing.strategy.example03;

import com.mashibing.strategy.example02.Receipt;

public class MT2101ReceiptHandlerStrategy implements ReceiptHandlerStrategy{
    @Override
    public void handlerReceipt(Receipt receipt) {
        System.out.println("解析报文MT2101:"+receipt.getMessage());
    }
}
