package com.mashibing.factory.abstract_factory.factory.impl;

import com.mashibing.factory.abstract_factory.factory.AppliancesFactory;
import com.mashibing.factory.abstract_factory.product.AbstractFreezer;
import com.mashibing.factory.abstract_factory.product.AbstractTV;
import com.mashibing.factory.abstract_factory.product.impl.TCLFreezer;
import com.mashibing.factory.abstract_factory.product.impl.TCLTV;

/**
 * 具体工厂：TCL
 * */
public class TCLFactory implements AppliancesFactory {
    @Override
    public AbstractTV createTV() {
        return new TCLTV();
    }

    @Override
    public AbstractFreezer createFreezer() {
        return new TCLFreezer();
    }
}
