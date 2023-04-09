package com.mashibing.chain.example01;

/**
 * 抽象处理者类
 * */

public abstract class Handler {

    //后继续处理者的引用
    protected Handler successor;

    public abstract void handle(RequestData requestData);

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
