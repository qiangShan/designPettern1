package com.mashibing.visitor.example01;

import java.time.LocalDate;

/**
 * 酒水类;
 * */

public class Wine extends Product implements Acceptable{
    public Wine(String name, LocalDate productDate, double price) {
        super(name, productDate, price);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
