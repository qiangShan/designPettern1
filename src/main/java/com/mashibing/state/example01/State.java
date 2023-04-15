package com.mashibing.state.example01;

/**
 * 抽象状态接口
 * */

public interface State {

    //声明抽象方法，不同具体状态类可以不同的实现
    public void handle(Context context);
}
