package com.mashibing.mediator.example02;

/**
 * 具体的同事类:房东
 * */

public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    //与中介联系的方法
    public void contact(String message){
        mediator.contact(message,this);
    }

    //获取信息的方法
    public void getMessage(String message){
        System.out.println("房主:"+name+",获取到信息是:"+message);
    }
}
