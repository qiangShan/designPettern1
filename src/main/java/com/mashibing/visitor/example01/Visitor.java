package com.mashibing.visitor.example01;

/**
 * 访问这接口:根据入参的不同，调用不同的重载方法
 * */

public interface Visitor {

    public void visit(Candy candy);  //糖果重载方法

    public void visit(Wine wine);  //酒水重载方法

    public void visit(Fruit fruit);  //水果重载方法

}
