package com.mashibing.adapter;

import com.mashibing.adapter.example01.Computer;
import com.mashibing.adapter.example01.SDAdapterTF;
import com.mashibing.adapter.example01.SDCard;
import com.mashibing.adapter.example01.SDCardImpl;
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
}
