package com.mashibing.iterator.example02;

import org.junit.Test;

public class Client {

    @Test
    public void test01(){
        Topic[] topics=new Topic[4];
        topics[0]=new Topic("1");
        topics[1]=new Topic("2");
        topics[2]=new Topic("3");
        topics[3]=new Topic("4");

        TopicList topicList = new TopicList(topics);
        IteratorIterator<Topic> iterator = topicList.iterator();

        while (iterator.hasNext()){
            Topic topic = iterator.next();
            System.out.println(topic);
        }

    }
}
