package com.mashibing.factory.schemes_factory.controller;

import com.mashibing.factory.schemes_factory.entiy.AwardInfo;
import com.mashibing.factory.schemes_factory.entiy.ResponseResult;
import com.mashibing.factory.schemes_factory.factory.FreeGoodsFactory;
import com.mashibing.factory.schemes_factory.service.IFreeGoods;

/**
 *  发放奖品类
 *
 * */
public class DeliverController {

    //发放奖品操作
    public ResponseResult awardToUser(AwardInfo awardInfo){

        try{
            IFreeGoods iFreeGoods = FreeGoodsFactory.getInstance(awardInfo.getAwardTypes());
            ResponseResult responseResult = iFreeGoods.sendFreeGoods(awardInfo);
            return responseResult;
        }catch (Exception exception){
            exception.printStackTrace();
            return  new ResponseResult("201","奖品发放失败!");
        }
    }
}
