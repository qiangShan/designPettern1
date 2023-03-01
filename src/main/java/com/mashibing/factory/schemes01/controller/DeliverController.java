package com.mashibing.factory.schemes01.controller;

import com.mashibing.factory.schemes01.entiy.AwardInfo;
import com.mashibing.factory.schemes01.entiy.DiscountResult;
import com.mashibing.factory.schemes01.entiy.SmallGiftInfo;
import com.mashibing.factory.schemes01.service.DiscountService;
import com.mashibing.factory.schemes01.service.SmallGiftService;
import com.mashibing.factory.schemes01.service.YouKuMemberService;

import java.util.UUID;

/**
 *  发放奖品类
 *
 * */

public class DeliverController {

    /**
     *  按照类型的不同发送奖品
     *     奖品类型：1，打折券 ，2，优酷会员 ，3，小礼品
     *
     * */


    public void awardToUser(AwardInfo awardInfo){

        if(awardInfo.getAwardTypes() == 1){  //发放打折券

            DiscountService discountService = new DiscountService();
            DiscountResult discountResult = discountService.sendDiscount(awardInfo.getUid(), awardInfo.getAwardNumber());
            System.out.println("打折券发放成功!"+discountResult);

        }else if(awardInfo.getAwardTypes() == 2){  //发放优酷会员

            String phone = awardInfo.getExtMap().get("phone");

            YouKuMemberService youKuMemberService = new YouKuMemberService();
            youKuMemberService.openMember(phone,awardInfo.getAwardNumber());
            System.out.println("优酷会员发放成功!");
        }else if(awardInfo.getAwardTypes() == 3){  //发放小礼品

            //封装收获人信息
            SmallGiftInfo info=new SmallGiftInfo();
            info.setUserPhone(awardInfo.getExtMap().get("phone"));
            info.setUserName(awardInfo.getExtMap().get("username"));
            info.setAddress(awardInfo.getExtMap().get("address"));
            info.setOrderId(UUID.randomUUID().toString());

            SmallGiftService smallGiftService=new SmallGiftService();
            Boolean aBoolean = smallGiftService.giveSmallGift(info);
            if(aBoolean){
                System.out.println("小礼品发放成功!");
            }

        }
    }
}
