package com.mashibing.strategy.example01;

/**
 * 具体策略类
 * */

public class ConcreteStrategyA implements Strategy{
    @Override
    public void algorithm() {
        System.out.println("执行策略A");
    }
}

