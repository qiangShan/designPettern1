package com.mashibing.command.example02;

import org.junit.Test;

public class Client {

    @Test
    public void test01(){
        Order order1=new Order();
        order1.setDiningTable(2);
        order1.getFoodMenu().put("酸辣鸡杂",1);
        order1.getFoodMenu().put("回锅肉",1);

        Order order2=new Order();
        order2.setDiningTable(15);
        order2.getFoodMenu().put("地三鲜",1);
        order2.getFoodMenu().put("十八秒猪肝",1);


        //接收者
        Chef chef = new Chef();

        //将订单和接收者封装命令对象
        OrderCommand orderCommand1 = new OrderCommand(chef, order1);
        OrderCommand orderCommand2 = new OrderCommand(chef, order2);

        //创建调用者
        Waiter waiter=new Waiter();
        waiter.setCommands(orderCommand1);
        waiter.setCommands(orderCommand2);

        //将订单发送给厨师，上菜
        waiter.orderUp();

    }
}
