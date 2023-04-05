package com.mashibing.flyweight.example02;

/**
 * 共享享元类：白色棋子
 * */

public class WhiteGobang extends GobangFlyweight{


    @Override
    public String getColor() {
        return "白色";
    }
}
