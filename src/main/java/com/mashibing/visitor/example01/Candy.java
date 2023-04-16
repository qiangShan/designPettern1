package com.mashibing.visitor.example01;

import java.time.LocalDate;

/**
 * 实际商品类:糖果类
 * */

public class Candy extends Product implements Acceptable{


    public Candy(String name, LocalDate productDate, double price) {
        super(name, productDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        //在accept方法中调用访问者，并将自己本身（this）传递回去
        visitor.visit(this);
    }
}
