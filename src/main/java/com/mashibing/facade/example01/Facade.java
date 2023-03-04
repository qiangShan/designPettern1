package com.mashibing.facade.example01;

/**
 * 外观类
 * */
public class Facade {

    private SubSystemA subSystemA=new SubSystemA();

    private SubSystemB subSystemB=new SubSystemB();

    private  SubSystemC subSystemC=new SubSystemC();

    public void method(){
        subSystemA.methodA();
        subSystemB.methodB();
        subSystemC.methodC();
    }
}
