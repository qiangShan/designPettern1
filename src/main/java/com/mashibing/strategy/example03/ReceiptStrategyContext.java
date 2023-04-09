package com.mashibing.strategy.example03;

import com.mashibing.strategy.example02.Receipt;

/**
 * 上下文类，持有策略接口，决定执行那个一个具体的策略类
 * */

public class ReceiptStrategyContext {

    private ReceiptHandlerStrategy receiptHandlerStrategy;

    public ReceiptStrategyContext(ReceiptHandlerStrategy receiptHandlerStrategy) {
        this.receiptHandlerStrategy = receiptHandlerStrategy;
    }

    public ReceiptStrategyContext() {
    }

    //调用策略的方法
    public void handlerReceipt(Receipt receipt){
        if(receipt != null){
            receiptHandlerStrategy.handlerReceipt(receipt);
        }
    }

    public ReceiptHandlerStrategy getReceiptHandlerStrategy() {
        return receiptHandlerStrategy;
    }

    public void setReceiptHandlerStrategy(ReceiptHandlerStrategy receiptHandlerStrategy) {
        this.receiptHandlerStrategy = receiptHandlerStrategy;
    }
}
