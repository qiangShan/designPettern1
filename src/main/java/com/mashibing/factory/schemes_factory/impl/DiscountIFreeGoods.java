package com.mashibing.factory.schemes_factory.impl;

import com.mashibing.factory.schemes_factory.entiy.AwardInfo;
import com.mashibing.factory.schemes_factory.entiy.ResponseResult;
import com.mashibing.factory.schemes_factory.service.IFreeGoods;

/**
 * 模拟打折券服务
 *
 * */

public class DiscountIFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {
        System.out.println("向用户发放一张打折券:"+awardInfo.getUid()+"，"+awardInfo.getAwardNumber());
        return new ResponseResult("200","打折券发放成功!");
    }
}
