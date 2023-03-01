package com.mashibing.factory;


import com.mashibing.factory.schemes_factory.controller.DeliverController;
import com.mashibing.factory.schemes_factory.entiy.AwardInfo;
import com.mashibing.factory.schemes_factory.entiy.ResponseResult;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestApi02 {

    DeliverController deliverController=new DeliverController();
    AwardInfo awardInfo=new AwardInfo();
    //测试发放奖品类
    @Test
    public void test01(){
        //1，发放打折券优惠
        awardInfo.setUid("1001");
        awardInfo.setAwardTypes(1);
        awardInfo.setAwardNumber("DEL12345");

        ResponseResult responseResult = deliverController.awardToUser(awardInfo);
        System.out.println(responseResult);
    }

    @Test
    public void test02(){
        //2，发放优酷会员
        awardInfo.setUid("1002");
        awardInfo.setAwardTypes(2);
        awardInfo.setAwardNumber("DW12345");
        Map<String,String> map=new HashMap<String,String>();
        map.put("phone","13761575648");
        awardInfo.setExtMap(map);

        ResponseResult responseResult = deliverController.awardToUser(awardInfo);
        System.out.println(responseResult);
    }

    @Test
    public void test03(){
        //3，发放小礼品
        awardInfo.setUid("1003");
        awardInfo.setAwardTypes(3);
        awardInfo.setAwardNumber("SM12345");
        Map<String,String> map=new HashMap<String,String>();
        map.put("username","单强");
        map.put("phone","1376157564");
        map.put("address","江西省抚州市南城县");
        awardInfo.setExtMap(map);

        ResponseResult responseResult = deliverController.awardToUser(awardInfo);
        System.out.println(responseResult);
    }
}
