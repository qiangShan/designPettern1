package com.mashibing.singleton.demo01;
/**
 * 单例模式-饿汉式
 * */
public class Singleton_01 {
    //1，私有构造
    private Singleton_01(){

    }

    //2,在本类中创建私有静态的全局对象
    private static Singleton_01 instance=new Singleton_01();

    //3,提供一个全局访问点，供外部访问获取单例对象
    public static Singleton_01 getInstance(){

        return instance;
    }
}
