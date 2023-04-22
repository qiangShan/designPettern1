package com.mashibing.mediator.example02;

/**
 * 具体同事类:租房者
 * */

public class Tenat extends Person{

    public Tenat(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void contact(String message){
        mediator.contact(message,this);
    }

    public void getMessage(String message){
        System.out.println("租房者:"+name+",获取到信息:"+message);
    }
}
