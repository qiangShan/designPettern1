package com.mashibing.proxy.example01;
/**
 * 目标类
 * */
public class UserDaoImpl implements IUserDao{
    @Override
    public void save() {
        System.out.println("保存用户数据!");
    }
}
