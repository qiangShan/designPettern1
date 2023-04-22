package com.mashibing.interpreter.example02;

/**
 * 数字表达式接口
 * */

public class NumExpression implements Expression{

    private long number;

    public NumExpression(long number) {
        this.number = number;
    }

    public NumExpression(String number) {
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }
}
