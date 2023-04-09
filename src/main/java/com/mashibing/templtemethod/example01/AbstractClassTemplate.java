package com.mashibing.templtemethod.example01;

/**
 * 抽象父类
 * */

public abstract class AbstractClassTemplate {

    public void step1(String key){
        System.out.println("在模版类中 ---> 执行步骤1：");

        if(this.step2(key)){
            this.step3();
        }else{
            this.step4();
        }

        this.step5();
    }
    public boolean step2(String key){
        System.out.println("在模版类中 ---> 执行步骤2：");

        if("x".equals(key)){
            return true;
        }
        return false;
    }

    public abstract void step3();

    protected abstract void step4();

    public void step5(){
        System.out.println("在模版类中 ---> 执行步骤5：");
    }

    public void run(String key){
        this.step1(key);
    }
}
