package com.mashibing.state.example01;

import org.junit.Test;

public class Client {

    @Test
    public void test01(){
        Context context=new Context();

        State stateA=new ConcreteStateA();
        stateA.handle(context);
        System.out.println(context.getCurrentState().toString());
        System.out.println("----------------------------------------------");

        State stateB=new ConcreteStateB();
        stateB.handle(context);
        System.out.println(context.getCurrentState().toString());
    }
}
