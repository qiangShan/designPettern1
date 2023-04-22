package com.mashibing.mediator.example01;

import org.junit.Test;

public class Client {

    @Test
    public void test01(){
        //创建中介者
        Mediator mediator=new MediatorImpl();
        //创建同事对象
        Colleague colleagueA=new ConcreteColleagueA(mediator);
        colleagueA.exec("key-A");
        Colleague colleagueB=new ConcreteColleagueB(mediator);
        colleagueB.exec("key-B");
    }
}
