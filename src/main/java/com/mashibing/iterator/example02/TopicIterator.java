package com.mashibing.iterator.example02;

/**
 * 具体迭代器
 * */

public class TopicIterator implements IteratorIterator<Topic>{

    private Topic[] topics;   //Topic数组

    private int position;  //记录存储位置的游标

    public TopicIterator(Topic[] topics) {
        this.topics = topics;
        this.position=0;
    }

    @Override
    public void reset() {
        position=0;
    }

    @Override
    public Topic next() {
        return topics[position++];
    }

    @Override
    public Topic currentItem() {
        return topics[position];
    }

    @Override
    public boolean hasNext() {
        if(position >= topics.length){
            return false;
        }
        return true;
    }
}
