package com.mashibing.framework.beans.context.support;

import com.mashibing.framework.beans.factory.BeanFactory;

/**
 * 定义非延迟加载功能
 * */

public interface ApplicationContext extends BeanFactory {

    //进行配置文件加载，并进行对象创建
    void refresh();
}
