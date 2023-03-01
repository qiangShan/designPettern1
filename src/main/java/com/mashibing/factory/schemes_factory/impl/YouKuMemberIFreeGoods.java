package com.mashibing.factory.schemes_factory.impl;

import com.mashibing.factory.schemes_factory.entiy.AwardInfo;
import com.mashibing.factory.schemes_factory.entiy.ResponseResult;
import com.mashibing.factory.schemes_factory.service.IFreeGoods;

/**
 *  优酷会员服务
 * */

public class YouKuMemberIFreeGoods implements IFreeGoods {

    @Override
    public ResponseResult sendFreeGoods(AwardInfo awardInfo) {
        String phone = awardInfo.getExtMap().get("phone");
        System.out.println("发放优酷会员成功，绑定手机号:"+phone);
        return new ResponseResult("200","优酷会员发放成功!");
    }
}
