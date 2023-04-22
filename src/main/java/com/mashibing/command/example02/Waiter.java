package com.mashibing.command.example02;

import java.util.ArrayList;

/**
 * 服务员:Invoker  调用者
 * */

public class Waiter {

    //可以持有很多命令对象
    private ArrayList<Command> commands;

    public Waiter() {
        this.commands=new ArrayList<>();
    }

    public Waiter(ArrayList<Command> commands) {
        this.commands = commands;
    }

    public ArrayList<Command> getCommands() {
        return commands;
    }

    public void setCommands(Command command) {
        this.commands.add(command);
    }

    //发出指令
    public void orderUp(){
        System.out.println("叮咚，服务员:有新的订单，请厨师进行炒菜......");
        for (Command command:commands){
            if(command != null){
                command.execute();
                System.out.println("--------------------");
            }
        }
    }
}
