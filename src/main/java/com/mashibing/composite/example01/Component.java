package com.mashibing.composite.example01;

//抽象根节点角色：对客户端，只需要针对抽象编程，无需关心具体子类是树枝节点还是夜子节点

public abstract class Component {

    public abstract void add(Component component);   //增加节点
    public abstract void remove(Component component);  //删除节点
    public abstract Component getChild(int i);  //获取节点
    public abstract void operation();  //业务方法
}
