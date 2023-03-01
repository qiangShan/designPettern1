package com.mashibing.factory.schemes_factory.service;

import com.mashibing.factory.schemes_factory.entiy.AwardInfo;
import com.mashibing.factory.schemes_factory.entiy.ResponseResult;

/**
 *  免费商品发放接口
 *
 */

public interface IFreeGoods {

    public ResponseResult sendFreeGoods(AwardInfo awardInfo);
}
