package com.mashibing.memento.example02;

import org.junit.Test;

public class Client {

    @Test
    public void test01() throws InterruptedException {
       //创建玩家类
       Player player=new Player(2000);

       //创建备忘录对象，保存玩家最初状态
        Memento memento = player.createMemento();

        for(int i=0;i<100; i++){
            //显示掷骰子的次数
            System.out.println("第"+(i+1)+"次掷骰子!");
            //显示当前玩家状态
            System.out.println("当前状态:"+player);

            //开启游戏
            player.yacht();
            System.out.println("玩家所持有的金币:"+player.getMoney());

            //复活操作
            if(player.getMoney()> memento.getMoney()){
                System.out.println("玩家赚到金币，保存当前状态，继续游戏");
                Memento memento1 = player.createMemento();  //更新快照
            }else if(player.getMoney()< memento.getMoney()/2){
                System.out.println("玩家所持金币不多，不支持玩游戏了，需将游戏恢复到初始状态!");
                player.restoreMemento(memento);
            }

            Thread.sleep(1000);
        }
    }
}
