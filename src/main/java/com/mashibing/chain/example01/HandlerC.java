package com.mashibing.chain.example01;

public class HandlerC extends Handler{
    @Override
    public void handle(RequestData requestData) {
        System.out.println("HandlerC 执行代码逻辑! 处理："+requestData.getData());

        requestData.setData(requestData.getData().replace("C"," "));
        //判断是否继续向后调用处理器
        if(successor != null){
            successor.handle(requestData);
        }else{
            System.out.println("执行终止");
        }
    }
}
