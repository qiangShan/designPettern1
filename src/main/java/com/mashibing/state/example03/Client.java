package com.mashibing.state.example03;

import org.junit.Test;

public class Client {

    @Test
    public void test01(){
        TrafficLight trafficLight=new TrafficLight();
        trafficLight.switchToRed();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
    }

}
