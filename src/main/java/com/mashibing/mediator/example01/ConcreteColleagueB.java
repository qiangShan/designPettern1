package com.mashibing.mediator.example01;

/**
 * 具体同事类
 * */

public class ConcreteColleagueB extends Colleague{

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void exec(String key) {
        System.out.println("=======在B同事中，通过中介者执行!");
        getMediator().apply(key);
    }
}
