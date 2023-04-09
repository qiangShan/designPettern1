package com.mashibing.templtemethod.example01;

public class Test01 {

    public static void main(String[] args) {
        AbstractClassTemplate conCreteClassA=new ConcreteClassA();
        conCreteClassA.run("x");
        System.out.println("-------------------------------------------------");
        AbstractClassTemplate conCreteClassB=new ConcreteClassB();
        conCreteClassB.run("");

    }
}
