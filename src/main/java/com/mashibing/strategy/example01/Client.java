package com.mashibing.strategy.example01;

public class Client {
    public static void main(String[] args) {
        Strategy strategyA=new ConcreteStrategyA();
        Context context = new Context(strategyA);
        context.algorithm();
        System.out.println("------------------------------------------");
        Strategy strategyB=new ConcreteStrategyB();
        Context context1 = new Context(strategyB);
        context1.algorithm();

    }
}
