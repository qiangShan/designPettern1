package com.mashibing.templtemethod.example01;

public class ConcreteClassA extends AbstractClassTemplate{
    @Override
    public void step3() {
        System.out.println("在子类A中 --->执行步骤3：");
    }

    @Override
    protected void step4() {
        System.out.println("在子类A中 --->执行步骤4：");
    }
}
