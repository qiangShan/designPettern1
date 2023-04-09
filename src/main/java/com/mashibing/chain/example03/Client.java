package com.mashibing.chain.example03;

import com.alibaba.fastjson2.JSON;
import com.mashibing.chain.example02.AuthService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Client {

    private Logger logger= LoggerFactory.getLogger(Client.class);

    @Test
    public void test01() throws ParseException {
        //定义责任链
        AuthLink authLink=new LevelAuthLink3("1000013","单强")
                .setAuthLink(new LevelAuthLink1("1000012","钦经理"))
                .setAuthLink(new LevelAuthLink1("1000011","江总"));

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = sdf.parse("2023-04-15 14:13:45");

        UUID orderId=UUID.randomUUID();
        logger.info("测试结果:{ }", JSON.toJSONString(authLink.doAuth("研发牛马",orderId.toString(),currentDate)));

        //模拟三级人审核
        AuthService.auth("1000012",orderId.toString());
        logger.info("测试结果:{ }","模拟三级负责人审批：单强");
        logger.info("测试结果:{ }", JSON.toJSONString(authLink.doAuth("研发牛马",orderId.toString(),currentDate)));

        //模拟二级人审核
        AuthService.auth("1000011",orderId.toString());
        logger.info("测试结果:{ }","模拟二级负责人审批：钦经理");
        logger.info("测试结果:{ }", JSON.toJSONString(authLink.doAuth("研发牛马",orderId.toString(),currentDate)));

        //模拟一级人审核
        AuthService.auth("1000013",orderId.toString());
        logger.info("测试结果:{ }","模拟三级负责人审批：江总");
        logger.info("测试结果:{ }", JSON.toJSONString(authLink.doAuth("研发牛马",orderId.toString(),currentDate)));

    }
}
