package com.mashibing.framework.beans.context.support;

import com.mashibing.framework.beans.factory.support.BeanDefinitionReader;
import com.mashibing.framework.beans.factory.support.BeanDefinitionRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * ApplicationContext接口的子类实现类
 *      创建容器对象，加载配置文件，对bean初始化;
 * */

public abstract class AbstractApplicationContext implements ApplicationContext{

    //声明解析器变量
    protected BeanDefinitionReader beanDefinitionReader;

    //定一个存储bean对象的Map集合
    protected Map<String, Object> singletonObjects=new HashMap<>();

    //声明一个配置文件路径变量
    protected String configLocation;

    @Override
    public void refresh() {
        //加载beanDefinition对象
        try {
            beanDefinitionReader.loadBeanDefinitions(configLocation);

            //初始化方法
            finshInitialization();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    //bean的初始化
    protected  void finshInitialization() throws Exception {
        //获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();

        //获取BeanDefinition对象
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            //进行bean的初始化
            getBean(beanDefinitionName);
        }
    }
}
