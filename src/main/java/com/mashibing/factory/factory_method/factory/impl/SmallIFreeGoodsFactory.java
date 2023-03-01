package com.mashibing.factory.factory_method.factory.impl;

import com.mashibing.factory.factory_method.factory.FreeGoodsFactory;
import com.mashibing.factory.schemes_factory.impl.SmallGiftIFreeGoods;
import com.mashibing.factory.schemes_factory.service.IFreeGoods;

/**
 *   生产小礼品发放接口-具体工厂
 * */

public class SmallIFreeGoodsFactory implements FreeGoodsFactory {

    @Override
    public IFreeGoods getInStance() {
        return new SmallGiftIFreeGoods();
    }
}
