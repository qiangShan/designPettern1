package com.mashibing.observer.example01;

/**
 * 具体观察者
 *
 * */

public class ConcreteObserver1 implements Observer{
    @Override
    public void update() {
        System.out.println("ConcreteObserver：得到通知，更新状态！ ");
    }
}
