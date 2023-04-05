package com.mashibing.flyweight.example01;

import com.mashibing.flyweight.example01.Flyweight;

/**
 * 非共享的具体享元类
 * */

public class UnsharedFlyweight extends Flyweight {

    private String inState;

    public UnsharedFlyweight(String inState) {
        this.inState = inState;
    }

    @Override
    public void operation(String state) {
        System.out.println("=====使用不共享对象，内部状态:"+inState+",外部状态:"+state);
    }
}
