package com.mashibing.memento.example01;


/**
 * 发起人角色
 * */

public class Originator {

    private String state="原始对象";

    private String id;
    private String name;
    private String phone;

    public Originator() {
    }


    //创建备忘录对象
    public Memento createMemento(){
        return new Memento(id,name,phone);
    }

    //恢复对象
    public void restoreMemento(Memento memento){
        this.state=memento.getState();
        this.id=memento.getId();
        this.name=memento.getName();
        this.phone=memento.getPhone();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

