package com.mashibing.builder.example01.builder;

import com.mashibing.builder.example01.product.Bike;

/**
 * 抽象建造者
 *
 **/

public abstract class Builder {

    protected Bike mBike=new Bike();

    public abstract void builderFrame();

    public abstract void builderSeat();

    public abstract Bike createBike();
}
