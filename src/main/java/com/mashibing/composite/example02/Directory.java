package com.mashibing.composite.example02;

//Directory 容器对象，表示文件夹

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry{
    //文件夹的名字
    private String name;

    //文件夹和文件集合
    private List<Entry> directory=new ArrayList<Entry>();

    public Directory (String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    /**
     *    获取文件大小的方法
     *          1，如果entry对象是file类型，则调用getSize()方法获取文件大小；
     *          2，如果entry对象是Directory类型，会继续调用子文件夹的getSize()，形成递归
     */

    @Override
    public int getSize() {
        int size=0;
        //遍历获取文件大小
        for(Entry entry:directory){
            size += entry.getSize();
        }

        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    public void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        for (Entry entry: directory) {
            entry.printList(prefix+"/"+name);
        }
    }
}
