package com.mashibing.factory.factory_method.factory;

import com.mashibing.factory.schemes_factory.service.IFreeGoods;

/**
 * 抽象工厂
 * */

public interface FreeGoodsFactory {

    IFreeGoods getInStance();
}
