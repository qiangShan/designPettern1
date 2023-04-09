package com.mashibing.observer.example03;

import com.mashibing.observer.example02.DrawHouseService;
import com.mashibing.observer.example02.LotteryResult;

import java.util.Date;

public class LotteryServiceImpl extends LotteryService {

    //注入摇号服务
    private DrawHouseService drawHouseService=new DrawHouseService();

    @Override
    public LotteryResult lottery(String uId) {
        //1，摇号
        String result = drawHouseService.lots(uId);

        return new LotteryResult(uId,result,new Date());
    }
}
