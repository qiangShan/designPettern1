package com.mashibing.chain.example01;

public class Client {

    public static void main(String[] args) {
        Handler handlerA=new HandlerA();
        Handler handlerB=new HandlerB();
        Handler handlerC=new HandlerC();

        //处理责任链
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        RequestData requestData=new RequestData("请求:ABCD");
        handlerA.handle(requestData);
    }



}
