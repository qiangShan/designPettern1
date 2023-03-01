package com.mashibing.singleton.demo03;

/**
 *  单例模式：懒汉式-线程安全
 * */

public class Singleton_03 {

    //1，私有构造方法
    private Singleton_03(){

    }

    //2,在本类中创建私有静态的全局对象
    private static Singleton_03 instance;

    //3,通过synchronized关键字，保证多线程模式下的单例对象唯一性
    public static synchronized Singleton_03 getInstance(){

        if(instance == null){
            instance=new Singleton_03();
        }
        return instance;
    }
}
