package com.mashibing.factory.abstract_factory.factory.impl;

/**
 * 具体工厂：海尔工厂
 *
 * */
import com.mashibing.factory.abstract_factory.factory.AppliancesFactory;
import com.mashibing.factory.abstract_factory.product.AbstractFreezer;
import com.mashibing.factory.abstract_factory.product.AbstractTV;
import com.mashibing.factory.abstract_factory.product.impl.HairFreezer;
import com.mashibing.factory.abstract_factory.product.impl.HairTv;

public class HairFactory implements AppliancesFactory {

    @Override
    public AbstractTV createTV() {
        return new HairTv();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HairFreezer();
    }
}
