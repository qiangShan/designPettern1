package com.mashibing.strategy.example03;

import com.mashibing.strategy.example02.Receipt;

public class MT8104ReceiptHandlerStategy implements ReceiptHandlerStrategy{
    @Override
    public void handlerReceipt(Receipt receipt) {
        System.out.println("解析报文MT8104:"+receipt.getMessage());
    }
}
