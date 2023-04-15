package com.mashibing.state.example01;

public class ConcreteStateB implements State{
    @Override
    public void handle(Context context) {
        System.out.println("进入到状态模式B......." );
        context.setCurrentState(this);
    }

    @Override
    public String toString(){
       return "当前状态:ConcreteStateB";
    }
}
