package com.mashibing.singleton.test01;

import org.junit.Test;
import com.mashibing.singleton.demo01.Singleton_01;
import com.mashibing.singleton.demo02.Singleton_02;
import com.mashibing.singleton.demo03.Singleton_03;
import com.mashibing.singleton.demo04.Singleton_04;
import com.mashibing.singleton.demo06.Singleton_06;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test_Singleton {

    //测试单例模式：饿汉式
    @Test
    public void test01() {
        Singleton_01 instance = Singleton_01.getInstance();

        Singleton_01 instance1 = Singleton_01.getInstance();

        System.out.println(instance == instance1);
    }

    //测试单例模式：懒汉式
    @Test
    public void test02() {
        Singleton_02 instance = Singleton_02.getInstance();

        Singleton_02 instance1 = Singleton_02.getInstance();

        System.out.println(instance == instance1);
    }

    //测试单例模式:懒汉式-多线程不安全
    @Test
    public void test03(){

        for(int i=0;i<1000;i++){
            new Thread(()->{
                Singleton_02 instance=Singleton_02.getInstance();
                System.out.println(Thread.currentThread().getName()+"--------"+instance);
            }).start();
        }
    }

    //测试单例模式:懒汉式-多线程安全
    @Test
    public void test04(){

        for(int i=0;i<1000;i++){
            new Thread(()->{
                Singleton_03 instance=Singleton_03.getInstance();
                System.out.println(Thread.currentThread().getName()+"--------"+instance);
            }).start();
        }
    }

    //测试单例模式:懒汉式-多线程安全
    @Test
    public void test05(){

        for(int i=0;i<1000;i++){
            new Thread(()->{
                Singleton_04 instance= Singleton_04.getInstance();
                System.out.println(Thread.currentThread().getName()+"--------"+instance);
            }).start();
        }
    }

    @Test
    public void test06() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Singleton_06> clazz = Singleton_06.class;

        Constructor<Singleton_06> declaredConstructor = clazz.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);

        Singleton_06 instance = declaredConstructor.newInstance();

        System.out.println(instance);

        Singleton_06 instance1 = declaredConstructor.newInstance(String.class, int.class);

        System.out.println(instance1);

    }
}