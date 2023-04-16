package com.mashibing.iterator.example01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Client {

    @Test
    public void test01(){
        List<String> names=new ArrayList<>();

        names.add("qiangShan");
        names.add("pingLiu");
        names.add("yongfengQin");

        Iterator<String> iterator=new ConcreteIterator<String>(names);
        while (iterator.hasNext()){
            System.out.println(iterator.currentItem());
            iterator.nextInt();
        }

        System.out.println("---------------------------------------------------------");
        java.util.Iterator<String> iterator1 = names.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }
}
