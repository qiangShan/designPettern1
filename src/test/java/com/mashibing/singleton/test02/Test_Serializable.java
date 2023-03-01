package com.mashibing.singleton.test02;

import org.junit.Test;
import com.mashibing.singleton.demo06.Singleton_06;

import java.io.*;

public class Test_Serializable {

    @Test
    public void test() throws Exception {
        //序列化对象输出流
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("tempFile.obj"));
        oos.writeObject(Singleton_06.getInstance());

        //序列化对象输入流
        File file=new File("tempFile.obj");
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
        Singleton_06 singleton_06 =(Singleton_06) ois.readObject();

        System.out.println(singleton_06);
        System.out.println(Singleton_06.getInstance());

        System.out.println(Singleton_06.getInstance() == singleton_06);
    }
}

/**
 * 单例类实现序列化接口
 * */
class Singleton implements Serializable{

    private Singleton(){

    }

    private volatile static Singleton singleton;

        public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton=new Singleton();
                }
            }
        }

        return singleton;
    }

    //只需要在单例类中定义readResolve方法,就可以解决序列化对单例的破坏
    //程序会判断是否有readResolve方法，如果有就执行该方法，如果不存在--就会创建一个新的对象。
    private Object readResolve(){
        return singleton;
    }
}
