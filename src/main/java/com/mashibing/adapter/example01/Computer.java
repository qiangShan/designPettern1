package com.mashibing.adapter.example01;

/**
 * 电脑类
 * */

public class Computer {

    public String read(SDCard sdCard){

        String data = sdCard.readSD();
        return data;
    }
}
