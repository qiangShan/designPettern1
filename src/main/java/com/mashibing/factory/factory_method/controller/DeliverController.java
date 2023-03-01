package com.mashibing.factory.factory_method.controller;

import com.mashibing.factory.factory_method.factory.FreeGoodsFactoryMap;
import com.mashibing.factory.factory_method.factory.FreeGoodsFactory;
import com.mashibing.factory.schemes_factory.entiy.AwardInfo;
import com.mashibing.factory.schemes_factory.entiy.ResponseResult;
import com.mashibing.factory.schemes_factory.service.IFreeGoods;

/**
 * 发放奖品接口
 * */

public class DeliverController {

    //发放奖品
    public ResponseResult awardToUser(AwardInfo awardInfo){

        //根据类型获取具体工厂
        FreeGoodsFactory goodsFactory = FreeGoodsFactoryMap.getParserFactory(awardInfo.getAwardTypes());
        //从工厂类获取对应的实例
        IFreeGoods iFreeGoods = goodsFactory.getInStance();

        System.out.println("=============工厂方法模式的输出=============");
        ResponseResult responseResult = iFreeGoods.sendFreeGoods(awardInfo);
        return responseResult;





        /**
        FreeGoodsFactory freeGoodsFactory=null;

        if(awardInfo.getAwardTypes() == 1){

            freeGoodsFactory=new DiscountIFreeGoodsFactory();

        }else if(awardInfo.getAwardTypes() ==3){

            freeGoodsFactory=new SmallIFreeGoodsFactory();

        }else if(awardInfo.getAwardTypes() == 2){
            freeGoodsFactory=new YouKuIFreeGoodsFactory();
         }

         IFreeGoods iFreeGoods = freeGoodsFactory.getInStance();


         System.out.println("=============工厂方法模式的输出=============");
         ResponseResult responseResult = iFreeGoods.sendFreeGoods(awardInfo);
         return responseResult;
         */

    }
}
