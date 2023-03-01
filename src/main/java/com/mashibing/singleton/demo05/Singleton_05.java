package com.mashibing.singleton.demo05;

/**
 * 单例模式:静态内部类
 * */

public class Singleton_05 {

    private Singleton_05(){
        if(SingletonHandler.instance != null){
            throw new RuntimeException("不允许非法访问");
        }
    }

    //1,创建静态内部类
    private static class SingletonHandler{
        //在静态内部类创建单例，在装载内部类的时候，才会创建单例对象
        private static Singleton_05 instance=new Singleton_05();
    }


    public static Singleton_05 getInstance(){

        return SingletonHandler.instance;
    }
}
