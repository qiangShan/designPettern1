package com.mashibing.iterator.example01;

/**
 * 迭代器接口
 * */

public interface Iterator<E> {

    //判断集合中是否有下一个元素
    public boolean hasNext();

    //将游标后移一位
    public void nextInt();

    //返回当前游标指定的元素
    E currentItem();
}
