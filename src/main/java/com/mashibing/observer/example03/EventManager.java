package com.mashibing.observer.example03;

import com.mashibing.observer.example02.LotteryResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 事件处理类
 * */

public class EventManager {

    public enum EventType{
        MQ,MESSAGE;
    }

    //监听者集合
    Map<Enum<EventType>, List<EventListener>> listeners=new HashMap();

    public EventManager(Enum<EventType> ... opertions){
        for(Enum<EventType> operation: opertions){
            this.listeners.put(operation,new ArrayList<>());
        }
    }

    /**
     * 订阅
     * @param eventTypeEnum 事件类型
     * @param listener 监听对象
     * */

    public void subscribe(Enum<EventType> eventTypeEnum,EventListener listener){
        List<EventListener> eventListeners = listeners.get(eventTypeEnum);
        eventListeners.add(listener);
    }

    /**
     * 取消订阅
     * @param eventTypeEnum 事件类型
     * @param listener 监听对象
     * */

    public void unsubscribe(Enum<EventType> eventTypeEnum,EventListener listener){
        List<EventListener> eventListeners = listeners.get(eventTypeEnum);
        eventListeners.remove(listener);
    }

    public void notify(Enum<EventType> eventTypeEnum, LotteryResult result){
        List<EventListener> users = listeners.get(eventTypeEnum);
        for (EventListener listener : users) {
            listener.doEvent(result);
        }
    }
}
