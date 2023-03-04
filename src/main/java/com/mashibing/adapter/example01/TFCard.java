package com.mashibing.adapter.example01;

/**
 * TF卡接口
 * */

public interface TFCard {

    //读取TF卡
    String readTF();

    //写入SD卡
    void writeTF(String msg);
}
