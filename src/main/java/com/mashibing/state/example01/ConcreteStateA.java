package com.mashibing.state.example01;

public class ConcreteStateA implements State{
    @Override
    public void handle(Context context) {
        System.out.println("进入到状态模式A......." );
        context.setCurrentState(this);
    }

    @Override
    public String toString(){
       return "当前状态:ConcreteStateA";
    }
}
