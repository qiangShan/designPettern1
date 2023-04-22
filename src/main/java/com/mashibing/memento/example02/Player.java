package com.mashibing.memento.example02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 玩家类
 * */

public class Player {

    private Integer money;   //玩家金币

    private List<String> fruits=new ArrayList<>();  //玩家水果

    private static String[] fruitsName={"苹果","香蕉","梨子","葡萄","马蹄"};   //水果的种类

    Random random=new Random();

    public Player(Integer money) {
        this.money = money;
    }

    //获取当前所有金币方法
    public Integer getMoney(){
        return money;
    }

    //获取水果一个
    public String getFruit(){
        String prefix="";
        if(random.nextBoolean()){
            prefix="好吃的";
        }

        //从数组拿一个水果
        String f=fruitsName[random.nextInt(fruitsName.length)];
        return prefix+f;
    }

    //掷骰子
    public void yacht(){
        Integer dice=random.nextInt(6)+1;  //掷骰子
        if(dice==1){
            money +=100 ;
            System.out.println("所持有的金币为:"+money);
        }else if(dice == 2){
            money -= 100;
            System.out.println("所持有的金币为:"+money);
        }else if(dice == 6){
            String fruit = getFruit();
            System.out.println("获取的水果:"+fruit);
            fruits.add(fruit);
        }else{
            System.out.println("无效数字，请技术掷骰子!");
        }
    }

    //拍摄快照
    public Memento createMemento(){
        Memento memento = new Memento(money);
        //只保持好吃的水果
        for(String fruit:fruits){
            if(fruit.startsWith("好吃的")){
                memento.addFruits(fruit);
            }
        }

        return memento;
    }


    //撤销方法
    public void restoreMemento(Memento memento){
        this.money=memento.getMoney();
        this.fruits=memento.getFruits();
    }

    @Override
    public String toString() {
        return "Player{" +
                "money=" + money +
                ", fruits=" + fruits +
                '}';
    }
}
