package com.mashibing.interpreter.example02;

import org.junit.Test;

public class Client {

    @Test
    public void test01(){
        ExpressionInterpreter interpreter=new ExpressionInterpreter();

        long result = interpreter.interpret("9 5 2 8 9 + - * /");
        System.out.println(result);
    }
}
