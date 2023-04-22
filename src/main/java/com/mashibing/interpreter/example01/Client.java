package com.mashibing.interpreter.example01;

import org.junit.Test;

public class Client {

    @Test
    public void test01(){
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        long result = interpreter.interpret("9 5 7 3 7 - + * /");
        System.out.println("result:"+result);
    }
}
