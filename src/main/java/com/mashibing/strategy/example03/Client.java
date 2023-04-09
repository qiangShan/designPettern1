package com.mashibing.strategy.example03;

import com.mashibing.strategy.example02.Receipt;
import com.mashibing.strategy.example02.ReceiptBuilder;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        //模拟回执
        List<Receipt> reciptList = ReceiptBuilder.getReciptList();

        //策略上下文
        ReceiptStrategyContext context = new ReceiptStrategyContext();
        //策略模式最主要的工作：将策略 定义、创建、使用这三部分进行解耦操作
        for(Receipt receipt:reciptList){
            //获取策略
            ReceiptStrategyFactory.init();
            ReceiptHandlerStrategy stategy = ReceiptStrategyFactory.getStategy(receipt.getType());
            //设置策略
            context.setReceiptHandlerStrategy(stategy);
            //执行策略
            context.handlerReceipt(receipt);
        }
    }
}
