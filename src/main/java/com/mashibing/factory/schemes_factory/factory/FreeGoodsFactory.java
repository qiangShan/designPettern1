package com.mashibing.factory.schemes_factory.factory;

import com.mashibing.factory.schemes_factory.impl.DiscountIFreeGoods;
import com.mashibing.factory.schemes_factory.impl.SmallGiftIFreeGoods;
import com.mashibing.factory.schemes_factory.impl.YouKuMemberIFreeGoods;
import com.mashibing.factory.schemes_factory.service.IFreeGoods;

/**
 *  具体工厂:生成免费商品
 *
 * */
public class FreeGoodsFactory {

    public static IFreeGoods getInstance(Integer awardType){

        IFreeGoods iFreeGoods=null;

        if(awardType == 1){  //1,打折券

            iFreeGoods=new DiscountIFreeGoods();

        }else if(awardType == 2){  //2,优酷会员

            iFreeGoods=new YouKuMemberIFreeGoods();

        }else if(awardType == 3){   //3,小礼品
            iFreeGoods=new SmallGiftIFreeGoods();
        }

        return iFreeGoods;
    }
}
