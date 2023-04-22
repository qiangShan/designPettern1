package com.mashibing.mediator.example02;

/**
 * 抽象中介者
 * */

public abstract class Mediator {

    //创建联络方法
    public abstract void contact(String message,Person person);
}
