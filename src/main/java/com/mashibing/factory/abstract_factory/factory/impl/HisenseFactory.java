package com.mashibing.factory.abstract_factory.factory.impl;

import com.mashibing.factory.abstract_factory.factory.AppliancesFactory;
import com.mashibing.factory.abstract_factory.product.AbstractFreezer;
import com.mashibing.factory.abstract_factory.product.AbstractTV;
import com.mashibing.factory.abstract_factory.product.impl.HisenseFreezer;
import com.mashibing.factory.abstract_factory.product.impl.HisenseTV;

/**
 * 具体工厂：海信
 * */

public class HisenseFactory implements AppliancesFactory {
    @Override
    public AbstractTV createTV() {
        return new HisenseTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new HisenseFreezer();
    }
}
