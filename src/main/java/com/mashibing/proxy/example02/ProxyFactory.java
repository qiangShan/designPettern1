package com.mashibing.proxy.example02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理工厂-动态生成代理对象
 * */

public class ProxyFactory {

    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    //为目标对象生成代理对象
    public Object getProxyInstance(){

        return Proxy.newProxyInstance(
                //目标类使用的类加载器
                target.getClass().getClassLoader(),
                //目标对象实现的接口对象
                target.getClass().getInterfaces(),
                new InvocationHandler() {  //事件处理器

                    /**
                     *  proxy 代理对象
                     *  method 对应于在代理对象上调用接口的方法实例
                     *  args  对应了代理对象在调用接口方法时传递的实际参数
                     *  java.lang.Object 返回目标对象的方法的返回值，没有返回值返回null
                     * */

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("开启事务");
                        method.invoke(target,args);
                        System.out.println("提交事务");
                        return null;
                    }
                }
        );
    }
}
