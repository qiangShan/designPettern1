package com.mashibing.builder.example01.builder;

/**
 * 具体建造者：哈罗单车
 * */

import com.mashibing.builder.example01.product.Bike;

public class HelloBikeBuilder extends Builder {

    @Override
    public void builderFrame() {
        System.out.println("制作碳纤维车架");
        mBike.setFrame("碳纤维车架");
    }

    @Override
    public void builderSeat() {
        System.out.println("制作橡胶车座");
        mBike.setSeat("橡胶车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
