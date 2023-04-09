package com.mashibing.observer.example03;

import com.mashibing.observer.example02.LotteryResult;

/**
 * 事件监听者接口
 * */

public interface EventListener {

    public void doEvent(LotteryResult lotteryResult);
}
