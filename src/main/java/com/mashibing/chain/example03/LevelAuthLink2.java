package com.mashibing.chain.example03;

import com.mashibing.chain.example02.AuthInfo;
import com.mashibing.chain.example02.AuthService;

import java.text.ParseException;
import java.util.Date;

public class LevelAuthLink2 extends AuthLink{

    private Date beginDate=sdf.parse("2023-05-01 00:00:00");
    private Date endDate=sdf.parse("2023-06-01 00:00:00");


    public LevelAuthLink2(String levelUserId, String levelUserName) throws ParseException {
        super(levelUserId, levelUserName);
    }

    @Override
    public AuthInfo doAuth(String uId, String orderId, Date authDate) {

        Date date = AuthService.queryAuthInfo(levelUserId, orderId);

        if(date == null){
            return new AuthInfo("0001","单号:"+orderId,"状态：待二级审核人进行审核",levelUserName);
        }

        AuthLink authLink = super.getAuthLink();
        if(authLink == null){
            return new AuthInfo("0001","单号:"+orderId,"状态：二级审核人审核完成,审批人",levelUserName);
        }

        if(authDate.before(beginDate) || authDate.after(endDate)){
            return new AuthInfo("0001","单号:"+orderId,"状态：二级审核人审核完成,审批人",levelUserName);
        }

        return authLink.doAuth(uId,orderId,authDate);
    }
}
