package com.mashibing.observer.example03;

/**
 * MQ消息发送事件监听
 * */

import com.mashibing.observer.example02.LotteryResult;

public class MQEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult lotteryResult) {
        System.out.println("记录用户的摇号结果（MQ），用户ID:"+lotteryResult.getuId()
        +"，摇号结果："+lotteryResult.getMsg());
    }
}
