package com.mashibing.command.example02;

import java.util.Set;

public class OrderCommand implements Command{

    //接收者对象引用
    private Chef receiver;
    private Order order;

    public OrderCommand(Chef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable()+"桌订单");
        Set<String> keySet = order.getFoodMenu().keySet();
        for(String key:keySet){
            receiver.makeFood(order.getFoodMenu().get(key),key);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(order.getDiningTable()+"桌的菜品已经上齐!");
    }
}
