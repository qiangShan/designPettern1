package com.mashibing.strategy.example02;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Receipt> reciptList = ReceiptBuilder.getReciptList();
        System.out.println(reciptList);

        for(Receipt receipt: reciptList){
            if("MT1101".equals(receipt.getType())){
                System.out.println("接收到MT1011的回执信息");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑A");
            }else if("MT2101".equals(receipt.getType())){
                System.out.println("接收到MT2011的回执信息");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑B");
            }else if("MT4101".equals(receipt.getType())){
                System.out.println("接收到MT4011的回执信息");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑C");
            }else if("MT8104".equals(receipt.getType())){
                System.out.println("接收到MT4011的回执信息");
                System.out.println("解析回执内容");
                System.out.println("执行业务逻辑D");
            }
        }
    }
}
