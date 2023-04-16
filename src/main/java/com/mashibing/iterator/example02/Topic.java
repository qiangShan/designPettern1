package com.mashibing.iterator.example02;

/**
 * 主题类
 * */

public class Topic {

    private String name;

    public Topic(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
