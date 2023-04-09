package com.mashibing.chain.example03;

import com.mashibing.chain.example02.AuthInfo;
import com.mashibing.chain.example02.AuthService;

import java.text.ParseException;
import java.util.Date;

public class LevelAuthLink3 extends AuthLink{


    public LevelAuthLink3(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {

        Date date = AuthService.queryAuthInfo(levelUserId, orderId);

        if(date == null){
            return new AuthInfo("0001","单号:"+orderId,"状态：待三级审核人进行审核",levelUserName);
        }

        AuthLink authLink = super.getAuthLink();
        if(authLink == null){
            return new AuthInfo("0001","单号:"+orderId,"状态：三级审核人审核完成,审批人",levelUserName);
        }

        return authLink.doAuth(uId,orderId,authDate);
    }
}
