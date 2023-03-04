package com.mashibing.facade.example02;

public class SmartAppliancesFacade {

    private Light light;
    private TV  tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.airCondition = new AirCondition();
    }

    public void say(String msg){
        if(msg.contains("打开")){
            on();
        }else if(msg.contains("关闭")){
            off();
        }else {
            System.out.println("对不起没有听清楚你说什么，请重新说一遍");
        }
    }

    //起床后，语音开启 电灯 电视 空调
    public void on(){
        System.out.println("闹钟响起，起床了");
        light.on();
        tv.on();
        airCondition.on();
    }

    //睡觉前，语音开启 电灯 电视 空调
    public void off(){
        System.out.println("洗漱之后，睡觉了");
        light.off();
        tv.off();
        airCondition.off();
    }
}
