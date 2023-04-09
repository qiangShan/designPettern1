package com.mashibing.observer.example02;

public class TestApp {
    public static void main(String[] args) {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.lottery("202304091350");
        System.out.println(result);
    }
}
