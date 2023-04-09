package com.mashibing.observer.example02;

import java.util.Date;

public class LotteryServiceImpl implements LotteryService{

    //注入摇号服务
    private DrawHouseService drawHouseService=new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        //1，摇号
        String result = drawHouseService.lots(uId);
        //2,发送短信
        System.out.println("发送短信通知用户,uId为："+uId+"，你的摇号结果如下:"+result);
        //3，发送MQ消息
        System.out.println("记录用户摇号结果到MQ,uId为："+uId+"，摇号结果:"+result);

        return new LotteryResult(uId,result,new Date());
    }
}
