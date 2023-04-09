package com.mashibing.observer.example02;

/**
 *
 * 模拟摇号服务
 * */

public class DrawHouseService {

    //摇号抽签
    public String lots(String uId){
        if(uId.hashCode()%2 ==0){
            return "恭喜uId为:"+uId+"的用户，在本次抽奖成功!😊😊";
        }else{
            return "很遗憾uId为:"+uId+"的用户，在本次抽奖失败!😭😭";
        }
    }
}
