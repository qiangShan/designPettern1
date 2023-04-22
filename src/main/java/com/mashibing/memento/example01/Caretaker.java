package com.mashibing.memento.example01;

/**
 * 负责人类：获取备忘录对象
 * */

public class Caretaker {

    private Memento memento;

    public Caretaker() {
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
