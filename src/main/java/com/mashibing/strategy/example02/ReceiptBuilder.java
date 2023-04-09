package com.mashibing.strategy.example02;

import java.util.ArrayList;
import java.util.List;

/**
 * 回执信息生成类
 * */

public class ReceiptBuilder {

    public static List<Receipt> getReciptList(){

        //模拟回执信息
        List<Receipt> list=new ArrayList<>();
        //回执类型:MT1101,MT2101,MT4101,MT8104
        list.add(new Receipt("回执信息:MT1101","MT1101"));
        //list.add(new Receipt("回执信息:MT2101","MT2101"));
        //list.add(new Receipt("回执信息:MT4101","MT4101"));
        //list.add(new Receipt("回执信息:MT8104","MT8104"));
        //......
        return list;
    }

}
