package com.mashibing.iterator.example02;

/**
 * 抽象迭代器
 * */

public interface IteratorIterator<E> {

    public void reset();   // 重置为第一个元素

    public E next();   //获取下一个元素

    public E currentItem();  //检索当前元素

    public boolean hasNext();  //判断集合中是否还有元素
}
