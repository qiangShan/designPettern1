package com.mashibing.singleton.demo06;

/**
 * 单例模式-枚举
 * */
public enum Singleton_06 {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static Singleton_06 getInstance(){

        return INSTANCE;
    }
}
