package com.mashibing.prototype.example01;

import org.junit.Test;

import java.io.*;

public class TestPrototype {

    @Test
    public void test01() throws CloneNotSupportedException {  //浅克隆

        ConcretePrototype concretePrototype1=new ConcretePrototype();
        ConcretePrototype concretePrototype2 = concretePrototype1.clone();

        System.out.println("对象C1和对象C2是同一个对象吗?"+(concretePrototype2 == concretePrototype1 ));
    }

    @Test
    public void test02() throws CloneNotSupportedException {

        ConcretePrototype concretePrototype=new ConcretePrototype();
        Person person=new Person("qiangShan",32);
        concretePrototype.setPerson(person);

        //复制
        ConcretePrototype concretePrototype1=concretePrototype.clone();
        Person person1 = concretePrototype1.getPerson();
        person1.setName("yongfengQing");

        concretePrototype.show();
        concretePrototype1.show();

        System.out.println("对象person和对象person1是同一个对象吗？"+(person==person1));


    }

    @Test
    public void test03() throws  Exception {

        ConcretePrototype concretePrototype=new ConcretePrototype();
        Person person=new Person("qiangShan",32);
        concretePrototype.setPerson(person);

        //创建对象序列化输出流
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("a.txt"));

        //将C1对象写到文件
        oos.writeObject(concretePrototype);
        oos.close();

        //创建对象序列化输入流
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("a.txt"));
        ConcretePrototype concretePrototype1 =(ConcretePrototype) ois.readObject();
        Person person1 = concretePrototype1.getPerson();
        person1.setName("yongfengQing");

        concretePrototype.show();
        concretePrototype1.show();

        System.out.println("对象person和对象person1是同一个对象吗？"+(person==person1));
    }
}
