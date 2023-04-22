package com.mashibing.mediator.example01;

/**
 * 抽象中介者
 * */

public interface Mediator {

    //处理同事对象注册与转发同事对象信息方法
    void apply(String key);
}
