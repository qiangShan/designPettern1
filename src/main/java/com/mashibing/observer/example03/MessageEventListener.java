package com.mashibing.observer.example03;

/**
 * 短信发送监听成功
 * */

import com.mashibing.observer.example02.LotteryResult;

public class MessageEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult lotteryResult) {
        System.out.println("发送短信通知，用户ID:"+lotteryResult.getuId()
        +",您的摇号结果为:"+lotteryResult.getMsg());
    }
}
