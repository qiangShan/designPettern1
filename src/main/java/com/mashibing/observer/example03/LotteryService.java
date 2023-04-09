package com.mashibing.observer.example03;

import com.mashibing.observer.example02.LotteryResult;

/**
 * 开奖服务接口
 * */

public abstract class LotteryService {

    private EventManager eventManager;

    public LotteryService(){
        //设置事件类型
        eventManager=new EventManager(EventManager.EventType.MQ,EventManager.EventType.MESSAGE);
        //订阅
        eventManager.subscribe(EventManager.EventType.MESSAGE,new MessageEventListener());
        eventManager.subscribe(EventManager.EventType.MQ,new MQEventListener());
    }

    public LotteryResult lotteryAndMsg(String uId){
        LotteryResult lottery=lottery(uId);

        eventManager.notify(EventManager.EventType.MESSAGE,lottery);
        eventManager.notify(EventManager.EventType.MQ,lottery);

        return lottery;

    }

    public abstract LotteryResult lottery(String uId);

}
