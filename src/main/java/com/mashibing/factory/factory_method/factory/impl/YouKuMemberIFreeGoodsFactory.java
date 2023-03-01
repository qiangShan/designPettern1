package com.mashibing.factory.factory_method.factory.impl;

import com.mashibing.factory.factory_method.factory.FreeGoodsFactory;
import com.mashibing.factory.schemes_factory.impl.YouKuMemberIFreeGoods;
import com.mashibing.factory.schemes_factory.service.IFreeGoods;

/**
 *  优酷会员发放接口-具体工厂
 * */

public class YouKuMemberIFreeGoodsFactory implements FreeGoodsFactory {
    @Override
    public IFreeGoods getInStance() {
        return new YouKuMemberIFreeGoods();
    }
}
