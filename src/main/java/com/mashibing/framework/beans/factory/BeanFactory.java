package com.mashibing.framework.beans.factory;

/**
 * IOC容器中父类接口
 *
 */

public interface BeanFactory {

    Object getBean(String beanName) throws Exception;

    //泛型方法
    <T> T getBean(String beanName,Class<? extends T> clazz) throws Exception;
}
