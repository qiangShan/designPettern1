package com.mashibing.composite.example02;

//Entry抽象类（文件夹+文件）

public abstract class Entry {

    public abstract String getName();  //获取文件名

    public abstract int getSize();  //获取文件大小

    //显示文件或者文件夹的方法
    public abstract Entry add(Entry entry);

    //显示指定目录下所有的文件信息
    public abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName()+"("+getSize()+")";
    }
}
