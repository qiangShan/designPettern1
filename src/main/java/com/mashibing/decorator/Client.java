package com.mashibing.decorator;

import com.mashibing.decorator.example02.BaseFileDataLoader;
import com.mashibing.decorator.example02.DataLoader;
import com.mashibing.decorator.example02.EncryptionDataDecorator;
import org.junit.Test;

public class Client {

    @Test
    public void test01(){

        String info="name:qiangShan,age:32";

        DataLoader dataLoader=new BaseFileDataLoader("demo.txt");
        dataLoader.write(info);
        String read = dataLoader.read();
        System.out.println(read);
        System.out.println();

        DataLoader dataLoader1=new EncryptionDataDecorator(new BaseFileDataLoader("demo02.txt"));
        dataLoader1.write(info);
        String read1 = dataLoader1.read();
        System.out.println(read1);
    }
}
