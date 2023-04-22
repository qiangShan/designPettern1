package com.mashibing.framework.beans.context.support;

import com.mashibing.framework.beans.BeanDefinition;
import com.mashibing.framework.beans.MutablePropertyValues;
import com.mashibing.framework.beans.PropertyValue;
import com.mashibing.framework.beans.factory.support.BeanDefinitionRegistry;
import com.mashibing.framework.beans.factory.xml.XmlBeanDefinitionReader;
import com.mashibing.framework.utils.SpringUtils;

import java.lang.reflect.Method;

/**
 * IOC容器具体的子实现类,加载XML格式的配置文件
 * */

public class ClassPathXmlApplicationContext extends AbstractApplicationContext{

    public ClassPathXmlApplicationContext(String configLocation) {
        this.configLocation=configLocation;
        //super.configLocation=configLocation;

        //构建解析器对象,指定具体解析类为XML
        this.beanDefinitionReader=new XmlBeanDefinitionReader();

        this.refresh();
    }

    //根据bean的对象名称，获取bean对象
    @Override
    public Object getBean(String beanName) throws Exception {

        //判断对象容器中是否包含指定名称的bean对象，有就返回没有就创建；
        Object obj = singletonObjects.get(beanName);
        if(obj != null){
            return obj;
        }

        //自行创建，获取BeanDefinition对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        BeanDefinition beanDefinition = registry.getBeanDefinition(beanName);

        //通过反正创建对象
        String className = beanDefinition.getClassName();
        Class aClass = Class.forName(className);

        //实例话
        Object beanObj = aClass.newInstance();


        //需要进行依赖注入
        MutablePropertyValues propertyValues = beanDefinition.getPropertyValues();
        for (PropertyValue propertyValue : propertyValues) {
            //获取property标签的属性
            String pName = propertyValue.getName();
            String pRef = propertyValue.getRef();
            String pValue=propertyValue.getValue();

            if(pRef != null && !"".equals(pRef)){
                //获取依赖bean对象
                Object bean = getBean(pRef);
                //setCourseDaoImpl  set+CourseDaoImpl
                String methodName = SpringUtils.getSetterMethod(pName);

                //获取所有方法对象
                Method[] methods = aClass.getMethods();
                for (Method method : methods) {
                    if(methodName.equals(method.getName())){
                        //执行该方法
                        method.invoke(beanObj,bean);
                    }
                }
            }
            if(pValue != null && !"".equals(pValue)){
                String methodName = SpringUtils.getSetterMethod(pName);
                //获取method
                Method method = aClass.getMethod(methodName, String.class);
                method.invoke(beanObj,pValue);
            }
        }

        //在返回beanObj之前，需要将对象存储到Map集合中
        this.singletonObjects.put(beanName,beanObj);
        return beanObj;
    }

    @Override
    public <T> T getBean(String beanName, Class<? extends T> clazz)  {
        Object bean = null;
        try {
            bean = getBean(beanName);

            if(bean == null){
                return null;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        return clazz.cast(bean);
    }
}
