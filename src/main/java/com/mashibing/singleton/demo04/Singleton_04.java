package com.mashibing.singleton.demo04;

/**
 *  单例模式：懒汉式-线程安全（同步锁，双重校验）
 * */

public class Singleton_04 {

    //1，私有构造方法
    private Singleton_04(){

    }

    //2,在本类中创建私有静态的全局对象
    //使用volatile 保证变量的可见性，屏蔽JVM指令重排序
    private volatile static Singleton_04 instance;

    //3,获取单例对象的静态方法
    public static  Singleton_04 getInstance(){
        //1,第一次判断，如果instance不为null，不进行抢锁阶段，直接返回实例
        if(instance ==null){
            synchronized (Singleton_04.class){
                //第二次判断，抢到锁之后再次进行判断，判断是否为null
                if(instance == null){
                    instance=new Singleton_04();
                }
            }
        }

        return instance;
    }
}
