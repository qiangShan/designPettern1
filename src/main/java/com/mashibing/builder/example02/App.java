package com.mashibing.builder.example02;

public class App {

    public static void main(String[] args) {

        //获取连接对象
        RabbitMQClient instance = new RabbitMQClient.Builder().setHost("192.168.52.123").setMode(1).setPort(5672).setQueue("test").build();

        instance.sendMessage("test");
    }
}
