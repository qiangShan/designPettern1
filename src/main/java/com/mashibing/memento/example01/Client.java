package com.mashibing.memento.example01;

import org.junit.Test;

public class Client {

    @Test
    public void test01(){
        //创建发起人角色
        Originator o1=new Originator();
        o1.setId("202304221142");
        o1.setName("qiangShan");
        o1.setPhone("13761575648");
        System.out.println(o1);
        System.out.println("------------------------------");

        //创建负责人对象
        Caretaker caretaker=new Caretaker();
        caretaker.setMemento(o1.createMemento());

        //修改
        o1.setName("yongfengQing");
        System.out.println(o1);
        System.out.println("-------------------------------");

        //从负责人对象获取备忘录对象
        o1.restoreMemento(caretaker.getMemento());
        System.out.println(o1);
    }
}
