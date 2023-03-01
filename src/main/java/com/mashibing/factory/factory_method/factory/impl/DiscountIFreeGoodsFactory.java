package com.mashibing.factory.factory_method.factory.impl;

import com.mashibing.factory.factory_method.factory.FreeGoodsFactory;
import com.mashibing.factory.schemes_factory.impl.DiscountIFreeGoods;
import com.mashibing.factory.schemes_factory.service.IFreeGoods;

/**
 * 优惠券发放接口-具体工厂
 * */

public class DiscountIFreeGoodsFactory implements FreeGoodsFactory {

    @Override
    public IFreeGoods getInStance() {
        //返回的是具体产品
        return new DiscountIFreeGoods();
    }
}
