package com.mashibing.framework.beans.factory.support;

import com.mashibing.framework.beans.BeanDefinition;
import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;

/**
 * 注册表对象
 * */

public interface BeanDefinitionRegistry {

    //注册BeanDefinition对象到注册表
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
            //throws BeanDefinitionStoreException;

    //从注册表移除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName); //throws NoSuchBeanDefinitionException;

    //根据名称获取注册表中的对应的BeanDefinition；
    BeanDefinition getBeanDefinition(String beanName); //throws NoSuchBeanDefinitionException;

    //判断注册表中是否包含指定名称的BeanDefinition对象
    boolean containsBeanDefinition(String beanName);

    //获取注册表中所有的BeanDefinition的对象名称
    String[] getBeanDefinitionNames();

    //获取注册表中的BeanDefinition对象的个数
    int getBeanDefinitionCount();

    //boolean isBeanNameInUse(String beanName);
}
