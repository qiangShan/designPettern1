package com.mashibing.decorator.example02;

/**
 * 抽象文件读取接口
 *
 * */

public interface DataLoader {

    String read();

    void write(String data);
}
