package com.mashibing.memento.example02;

import java.util.ArrayList;

/**
 * 备份玩家的状态
 * */

class Memento {

    private Integer money;  //玩家获取的金币

    ArrayList fruits;   //玩家获取的水果

    public Memento(Integer money) {
        this.money = money;
        this.fruits=new ArrayList();
    }

    //获取玩家当前金币
    public Integer getMoney(){
        return money;
    }

    //获取当前玩家水果
    public ArrayList getFruits(){
        return (ArrayList) fruits.clone();
    }

    //添加水果
    public void addFruits(String fruit){
        fruits.add(fruit);
    }
}
