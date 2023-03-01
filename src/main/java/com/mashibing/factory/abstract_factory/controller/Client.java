package com.mashibing.factory.abstract_factory.controller;

import com.mashibing.factory.abstract_factory.factory.AppliancesFactory;
import com.mashibing.factory.abstract_factory.factory.impl.HairFactory;
import com.mashibing.factory.abstract_factory.product.AbstractFreezer;
import com.mashibing.factory.abstract_factory.product.AbstractTV;

public class Client {

    private AbstractTV tv;

    private AbstractFreezer freezer;

    public Client(){

    }

    public Client(AppliancesFactory appliancesFactory){
        //在客户端看来就是使用抽象工厂生产家电
        this.tv=appliancesFactory.createTV();
        this.freezer=appliancesFactory.createFreezer();
    }

    public AbstractTV getTv() {
        return tv;
    }

    public void setTv(AbstractTV tv) {
        this.tv = tv;
    }

    public AbstractFreezer getFreezer() {
        return freezer;
    }

    public void setFreezer(AbstractFreezer freezer) {
        this.freezer = freezer;
    }

    public static void main(String[] args) {
        Client client = new Client(new HairFactory());
        AbstractTV tv = client.getTv();
        System.out.println(tv);
        System.out.println("-----------------------------");
        AbstractFreezer freezer = client.getFreezer();
        System.out.println(freezer);
    }
}
