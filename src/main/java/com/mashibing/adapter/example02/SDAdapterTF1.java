package com.mashibing.adapter.example02;

import com.mashibing.adapter.example01.SDCard;
import com.mashibing.adapter.example01.TFCard;

/**
 * 对象适配器类
 * */

public class SDAdapterTF1 implements SDCard {

    private TFCard tfCard;

    public SDAdapterTF1(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
