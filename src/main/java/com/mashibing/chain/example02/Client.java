package com.mashibing.chain.example02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Client {
    public static void main(String[] args) throws ParseException {

        AuthController authController = new AuthController();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2023-04-15 12:51:49");

        //模拟审核请求及审批操作
        UUID uuid=UUID.randomUUID();
        AuthInfo inf3 = authController.doAuth("研发单强", uuid.toString(), date);
        System.out.println("当前审核状态:"+inf3.getInfo());

        AuthService.auth("1000013",uuid.toString());
        System.out.println("三级审批负责人审批完成，审批人：钦永凤");
        System.out.println("-----------------------------------------------");

        AuthInfo inf2 = authController.doAuth("研发单强", uuid.toString(), date);
        System.out.println("当前审核状态:"+inf2.getInfo());

        AuthService.auth("1000012",uuid.toString());
        System.out.println("二级审批负责人审批完成，审批人：江经理");
        System.out.println("-----------------------------------------------");

        AuthInfo inf1 = authController.doAuth("研发单强", uuid.toString(), date);
        System.out.println("当前审核状态:"+inf1.getInfo());

        AuthService.auth("1000011",uuid.toString());
        System.out.println("一级审批负责人审批完成，审批人：王总");


    }
}
