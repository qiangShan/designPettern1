package com.mashibing.visitor.example01;

/**
 *
 * 接待者接口（抽象元素角色）
 * */

public interface Acceptable {

    //接待所有的Visitor的访问者子类
    public void accept(Visitor visitor);
}
