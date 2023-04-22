package com.mashibing.framework.beans.factory.support;

/**
 * 该接口定义配置文件解析的规则
 * */

public interface BeanDefinitionReader {

    //获取注册表对象
    BeanDefinitionRegistry getRegistry();

    //加载配置文件，并在注册表中注册
    void loadBeanDefinitions(String configLocation) throws Exception;
}
