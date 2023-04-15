package com.mashibing.state.example02;

/**
 * 交通灯类
 *     红灯：禁止  绿灯：通行  黄灯：警示
 * */

public class TrafficLight {

    //初始化状态
    private String stateColor="红";

    //切换为绿灯，通行状态
    public void switchToGreen(){
        if("绿".equals(stateColor)){
            System.out.println("当前为绿灯，无需进行切换");
        }else if("红".equals(stateColor)){
            System.out.println("当前为红灯，无法进行切换为绿灯");
        }else{
            stateColor="绿";
            System.out.println("绿灯亮起....时长：60S");
        }
    }

    //切换为黄灯，警示状态
    public void switchToYellow(){
        if("黄".equals(stateColor)){
            System.out.println("当前为黄灯，无需进行切换");
        }else if("红".equals(stateColor) || "绿".equals(stateColor)){
            System.out.println("当前为红灯或绿灯，可切换为黄灯");
            stateColor="黄";
            System.out.println("黄灯亮起......时长:13S");
        }
    }

    //切换为红灯，禁止状态
    public void switchToRed(){
        if("红".equals(stateColor)){
            System.out.println("当前为红灯，无需进行切换");
        }else if("绿".equals(stateColor)){
            System.out.println("当前为绿灯，无法进行切换为红灯");
        }else if("黄".equals(stateColor)){
            stateColor="黄";
            System.out.println("红灯亮起......时长:60");

        }
    }
}
