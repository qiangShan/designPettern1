package com.mashibing.state.example03;

/**
 * 具体切换灯类：红灯
 * */

public class YellowState implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("绿灯亮起，时常：60S");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("当前就是黄灯，无需切换");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("红灯亮起，时常：60S");
    }
}
