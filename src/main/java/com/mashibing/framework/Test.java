package com.mashibing.framework;

import com.mashibing.framework.beans.factory.support.BeanDefinitionRegistry;
import com.mashibing.framework.beans.factory.support.SimpleBeanDefinitionRegistry;
import com.mashibing.framework.beans.factory.xml.XmlBeanDefinitionReader;

public class Test {
    public static void main(String[] args) {
        BeanDefinitionRegistry beanDefinitionRegistry=new SimpleBeanDefinitionRegistry();
        XmlBeanDefinitionReader reade=new XmlBeanDefinitionReader(beanDefinitionRegistry);

        try {
            reade.loadBeanDefinitions("bean.xml");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
