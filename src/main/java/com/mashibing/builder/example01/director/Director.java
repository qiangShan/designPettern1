package com.mashibing.builder.example01.director;

import com.mashibing.builder.example01.builder.Builder;
import com.mashibing.builder.example01.product.Bike;

/**
 *
 * 指挥者
 * */

public class Director {

    private Builder mBuilder;

    public Director() {

    }

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    //制作自行车
    public Bike construct(){
        mBuilder.builderFrame();
        mBuilder.builderSeat();
        return mBuilder.createBike();
    }
}
