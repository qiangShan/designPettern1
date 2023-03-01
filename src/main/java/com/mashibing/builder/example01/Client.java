package com.mashibing.builder.example01;

import com.mashibing.builder.example01.builder.MobikeBuilder;
import com.mashibing.builder.example01.director.Director;
import com.mashibing.builder.example01.product.Bike;

public class Client {

    public static void main(String[] args) {
        //1,创建一个指挥者
        Director director=new Director(new MobikeBuilder());
        //2,获取自行车
        Bike bike = director.construct();

        System.out.println(bike.getFrame()+"，"+bike.getSeat());
    }
}
