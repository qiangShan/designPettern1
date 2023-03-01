package com.mashibing.factory.schemes01.service;

//import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson2.JSON;
import com.mashibing.factory.schemes01.entiy.SmallGiftInfo;


/**
 * 小礼品服务
 *
 **/
public class SmallGiftService {

    public Boolean giveSmallGift(SmallGiftInfo smallGiftInfo){
        System.out.println("小礼品已发送,获取用户请注意查收!" + JSON.toJSON(smallGiftInfo));
        return true;
    }
}
