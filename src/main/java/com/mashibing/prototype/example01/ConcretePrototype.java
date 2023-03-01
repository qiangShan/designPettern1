package com.mashibing.prototype.example01;

import java.io.Serializable;

/**
 *
 * 具体原型类
 *   实现cloneable标识接口，标识当前对象可复制
 * */

public class ConcretePrototype implements Cloneable , Serializable {

    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void show(){
        System.out.println("嫌疑人姓名:"+person.getName());
    }

    public ConcretePrototype(){

        System.out.println("具体原型对象创建成功！");
    }

    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        System.out.println("克隆对象复制成功!");
        return (ConcretePrototype) super.clone();
    }
}
