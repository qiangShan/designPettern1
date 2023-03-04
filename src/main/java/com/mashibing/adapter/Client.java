package com.mashibing.adapter;

import com.mashibing.adapter.example01.*;
import com.mashibing.adapter.example02.SDAdapterTF1;
import org.junit.Test;

public class Client {

    @Test
    public void test01(){
        Computer computer=new Computer();

        SDCard sdCard=new SDCardImpl();
        String readSD = computer.read(sdCard);
        System.out.println(readSD);

        System.out.println();

        SDAdapterTF sdAdapterTF = new SDAdapterTF();
        String readTF = computer.read(sdAdapterTF);
        System.out.println(readTF);
    }

    @Test
    public void test02(){
        Computer computer=new Computer();
        SDCard sdCard=new SDCardImpl();
        String read = computer.read(sdCard);
        System.out.println(read);

        System.out.println();

        TFCard tfCard = new TFCardImpl();
        SDAdapterTF1 sdAdapterTF1 = new SDAdapterTF1(tfCard);
        String read1 = computer.read(sdAdapterTF1);
        System.out.println(read1);
    }
}
