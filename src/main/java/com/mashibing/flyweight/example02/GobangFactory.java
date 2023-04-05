package com.mashibing.flyweight.example02;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类:生产五子棋类
 * */

public class GobangFactory {

    //声明享元池
    private static Map<String,GobangFlyweight> pool;

    //创建共享享元对象，设置对象的内部状态
    private GobangFactory(){
        pool=new HashMap<>();
        GobangFlyweight black = new BlackGobang();
        GobangFlyweight white=new WhiteGobang();

        pool.put("black",black);
        pool.put("white",white);
    }

    //获取唯一享元工厂对象的方法
    public static GobangFactory getInstance(){
        return SingletonHandler.INSTANCE;
    }

    //静态内部类
    private static class SingletonHandler{
        private static final GobangFactory INSTANCE=new GobangFactory();
    }

    //通过key获取集合中的享元对象
    public GobangFlyweight getGobang(String key){
        return pool.get(key);
    }
}
