package com.mashibing.iterator.example01;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * 具体迭代器
 * */
public class ConcreteIterator<E> implements Iterator<E>{

    private  int cursor; //游标
    private List<E> list;  //容器

    public ConcreteIterator(List<E> list) {
        this.cursor = 0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public void nextInt() {
        cursor++;
    }

    @Override
    public E currentItem() {
        if(cursor >= list.size()){
            throw new NoSuchElementException();
        }
        return list.get(cursor);
    }
}
