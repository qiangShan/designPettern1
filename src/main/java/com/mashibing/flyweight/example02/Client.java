package com.mashibing.flyweight.example02;

public class Client {
    public static void main(String[] args) {
        GobangFactory instance=GobangFactory.getInstance();

        GobangFlyweight b1=instance.getGobang("black");
        GobangFlyweight b2=instance.getGobang("black");
        GobangFlyweight b3=instance.getGobang("black");
        System.out.println("判断黑子是否为同一对象:"+(b1==b2));

        GobangFlyweight w1=instance.getGobang("white");
        GobangFlyweight w2=instance.getGobang("white");
        GobangFlyweight w3=instance.getGobang("white");
        System.out.println("判断黑子是否为同一对象:"+(w2==w3));

        b1.display();
        b2.display();
        b3.display();
        System.out.println("--------------------------------------------");
        w1.display();
        w3.display();
        w2.display();
    }
}
