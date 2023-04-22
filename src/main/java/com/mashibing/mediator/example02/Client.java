package com.mashibing.mediator.example02;

import org.junit.Test;

public class Client {

    @Test
    public void test01(){

        //创建中介机构
        MediatorStructure mediator=new MediatorStructure();

        //创建房东
        HouseOwner houseOwner=new HouseOwner("梅梅",mediator);

        //创建租房者
        Tenat tenat=new Tenat("单强",mediator);

        //中介收集房东和租房者信息
        mediator.setHouseOwner(houseOwner);
        mediator.setTenat(tenat);

        tenat.contact("需要在宝安区找一个一室一厅的房子，两夫妻居住，房租在1000～1500");
        houseOwner.contact("宝安区刚好有一套地铁站附近一室一厅的房子，房租在1200～1700租金");

    }
}
