package com.mashibing.singleton.test02;


import com.mashibing.singleton.demo05.Singleton_05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射对于单例的破坏
 * */

public class Test_Reflect {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Singleton_05> singleton_05Class = Singleton_05.class;

        Constructor<Singleton_05> declaredConstructor = singleton_05Class.getDeclaredConstructor();

        declaredConstructor.setAccessible(true);  //设置为true后，就可以对类中的私有成员进行操作；

        Singleton_05 singleton_05 = declaredConstructor.newInstance();

        Singleton_05 singleton_051 = declaredConstructor.newInstance();

        System.out.println(singleton_05 == singleton_051);
    }
}
