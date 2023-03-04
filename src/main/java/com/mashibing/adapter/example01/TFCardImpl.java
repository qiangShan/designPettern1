package com.mashibing.adapter.example01;

public class TFCardImpl implements TFCard{
    @Override
    public String readTF() {
        String msg="tf card read data";
        return msg;
    }

    @Override
    public void writeTF(String msg) {
        System.out.println("tf card write data:"+msg);
    }
}
