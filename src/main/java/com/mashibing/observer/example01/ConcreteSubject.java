package com.mashibing.observer.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体目标类
 * */


public class ConcreteSubject implements Subject{

    //定义集合，存储所有的观察者对象
    private List<Observer> observes=new ArrayList<>();

    //注册方法，向观察者集合增加一个观察者
    @Override
    public void attach(Observer observer) {
        observes.add(observer);
    }

    //注销方法:用于从观察者集合中删除观察者
    @Override
    public void detache(Observer observer) {
        observes.remove(observer);
    }

    //通知方法
    @Override
    public void notifyObserver() {
        //遍历集合，调用每一个观察者的响应方法
        for(Observer observer:observes){
            observer.update();
        }
    }
}
