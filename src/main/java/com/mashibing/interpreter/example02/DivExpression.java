package com.mashibing.interpreter.example02;

public class DivExpression implements Expression{

    private Expression exp1;
    private Expression exp2;

    public DivExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret() / exp2.interpret();
    }
}
