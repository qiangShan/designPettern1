package com.mashibing.observer.example01;

/**
 * 抽象观察者
 * */

public interface Observer {

    //update方法:为不同的观察者更新行为定一个相同的接口，不同的观察者对该接口有不同实现
    public void update();
}
