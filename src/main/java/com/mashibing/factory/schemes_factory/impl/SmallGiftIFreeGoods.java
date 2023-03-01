package com.mashibing.factory.schemes_factory.impl;

import com.alibaba.fastjson2.JSON;
import com.mashibing.factory.schemes_factory.entiy.AwardInfo;
import com.mashibing.factory.schemes_factory.entiy.ResponseResult;
import com.mashibing.factory.schemes_factory.entiy.SmallGiftInfo;
import com.mashibing.factory.schemes_factory.service.IFreeGoods;

import java.util.UUID;

/**
 *  小礼品发放服务成功
 * */

public class SmallGiftIFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {
        SmallGiftInfo smallGiftInfo=new SmallGiftInfo();
        smallGiftInfo.setUserPhone(awardInfo.getExtMap().get("phone"));
        smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
        smallGiftInfo.setAddress(awardInfo.getExtMap().get("address"));
        smallGiftInfo.setOrderId(UUID.randomUUID().toString());

        System.out.println("小礼品发放成功，请注意查收:"+ JSON.toJSON(smallGiftInfo));
        return new ResponseResult("200","小礼品发放成功!",smallGiftInfo);
    }
}
