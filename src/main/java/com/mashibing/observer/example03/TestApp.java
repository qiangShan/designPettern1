package com.mashibing.observer.example03;

import com.mashibing.observer.example02.LotteryResult;

public class TestApp {
    public static void main(String[] args) {
        LotteryService service=new LotteryServiceImpl();
        LotteryResult lotteryResult = service.lotteryAndMsg("10");
        System.out.println(lotteryResult);
    }
}
