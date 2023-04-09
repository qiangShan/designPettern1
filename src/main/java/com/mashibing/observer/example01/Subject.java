package com.mashibing.observer.example01;

/**
 * 抽象目标类
 * */

public interface Subject {
    public void attach(Observer observer);
    public void detache(Observer observer);
    void notifyObserver();
}
