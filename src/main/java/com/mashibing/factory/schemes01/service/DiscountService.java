package com.mashibing.factory.schemes01.service;

import com.mashibing.factory.schemes01.entiy.DiscountResult;

/**
 * 打折券服务
 *
 * */

public class DiscountService {

    public DiscountResult sendDiscount(String uid,String awardNumber){

        System.out.println("向用户发送一张打折券:"+uid+"，"+awardNumber);
        return new DiscountResult("200","发送打折券成功！");
    }
}
