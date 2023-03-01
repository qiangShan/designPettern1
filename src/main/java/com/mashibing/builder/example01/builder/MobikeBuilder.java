package com.mashibing.builder.example01.builder;

/**
 * 具体建造者：摩拜单车
 * */

import com.mashibing.builder.example01.product.Bike;

public class MobikeBuilder extends Builder {

    @Override
    public void builderFrame() {
        System.out.println("制作车架:");
        mBike.setFrame("铝合金车架");
    }

    @Override
    public void builderSeat() {
        System.out.println("制作车座:");
        mBike.setSeat("真皮车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
