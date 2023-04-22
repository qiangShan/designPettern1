package com.mashibing.mediator.example01;

/**
 *  抽象同事类
 * */

public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    //同事之间进行交互的抽象方法
    public  abstract void exec(String key);

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
