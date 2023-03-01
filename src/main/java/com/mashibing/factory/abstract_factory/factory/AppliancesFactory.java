package com.mashibing.factory.abstract_factory.factory;

import com.mashibing.factory.abstract_factory.product.AbstractFreezer;
import com.mashibing.factory.abstract_factory.product.AbstractTV;

/**
 * 抽象工厂：在一个抽象工厂可以声明多个工厂方法，用于创建不同的类型产品
 *
 * */

public interface AppliancesFactory {

    AbstractTV createTV();

    AbstractFreezer createFreezer();
}
