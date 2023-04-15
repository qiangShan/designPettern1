package com.mashibing.state.example03;

/**
 * 具体切换灯类：红灯
 * */

public class RedState implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("红灯不能切换为绿灯");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("黄灯亮起......时常：13S");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("当前就是红灯，无需进行切换");
    }
}
