package com.mashibing.state.example03;

/**
 * 具体切换灯类：红灯
 * */

public class GreenState implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("当前就是绿灯，无需进行切换");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("黄灯亮起......时常：13S");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("当前是绿灯，无法进行切换");
    }
}
