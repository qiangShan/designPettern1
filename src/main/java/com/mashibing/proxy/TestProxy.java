package com.mashibing.proxy;

import com.mashibing.proxy.example01.IUserDao;
import com.mashibing.proxy.example01.UserDaoImpl;
import com.mashibing.proxy.example01.UserDaoProxy;
import com.mashibing.proxy.example02.ProxyFactory;
import com.mashibing.proxy.example03.User;
import com.mashibing.proxy.example03.UserLogProxy;
import com.mashibing.proxy.example03.UserServiceImpl;
import org.junit.Test;

import java.util.List;

public class TestProxy {

    @Test
    public void testStaticProxy(){
        //目标类
        IUserDao dao=new UserDaoImpl();

        //代理对象
        UserDaoProxy proxy=new UserDaoProxy(dao);
        proxy.save();
    }

    @Test
    public void testProxy(){
        IUserDao dao=new UserDaoImpl();
        System.out.println(dao.getClass()); //目标对象信息

        IUserDao proxyInstance =(IUserDao) new ProxyFactory(dao).getProxyInstance();  //获取代理对象
        System.out.println(proxyInstance.getClass());
        proxyInstance.save();  //代理方法

    }

    @Test
    public void testCglib(){
        //目标类
        UserServiceImpl userService = new UserServiceImpl();
        System.out.println(userService.getClass());

        //代理对象
        UserServiceImpl logProxy =(UserServiceImpl) new UserLogProxy().getLogProxy(userService);
        System.out.println(logProxy.getClass());

        List<User> userList = logProxy.findUserList();
        System.out.println("用户信息:"+userList);

    }
}
