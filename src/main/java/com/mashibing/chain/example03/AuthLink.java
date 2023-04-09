package com.mashibing.chain.example03;

import com.mashibing.chain.example02.AuthInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * 抽象审核链
 * */

public abstract class AuthLink {

    protected Logger logger= LoggerFactory.getLogger(AuthLink.class);

    protected SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    protected String levelUserId; //审核人ID

    protected String levelUserName; //审核人姓名

    protected  AuthLink authLink;  //表示持有下一个处理对象的引用

    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }




    //获取下一个处理器
    public AuthLink getAuthLink() {
        return authLink;
    }
    //向责任链中添加处理器
    public AuthLink setAuthLink(AuthLink authLink) {
        this.authLink = authLink;
        return this;
    }

    //抽象审核方法
    public abstract AuthInfo doAuth(String uId, String orderId, Date authDate);
}
