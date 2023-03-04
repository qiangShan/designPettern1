package com.mashibing.facade;

import com.mashibing.facade.example01.Facade;
import com.mashibing.facade.example02.SmartAppliancesFacade;
import org.junit.Test;

public class Client {

    @Test
    public void test01(){
        Facade facade=new Facade();
        facade.method();
    }

    @Test
    public void test02(){
        SmartAppliancesFacade smartAppliancesFacade=new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开家电");
        System.out.println();
        smartAppliancesFacade.say("关闭家电");
    }
}
