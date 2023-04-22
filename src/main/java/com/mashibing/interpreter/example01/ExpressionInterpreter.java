package com.mashibing.interpreter.example01;

import java.util.Deque;
import java.util.LinkedList;

/***
 * 表达式解释器
 *
 */

public class ExpressionInterpreter {

    //双向队列，可以从队列两端增加或者删除
    private Deque<Long> numbers=new LinkedList<>();

    //接收表达式，进行解析
    public long interpret(String expression){
        //9 5 7 3 - + *
        String[] elements = expression.split(" ");

        int length=elements.length;

        //获取表达式中的数字
        for(int i=0; i<(length+1)/2 ; ++i){
            //向集合尾部添加元素
            numbers.addLast(Long.parseLong(elements[i]));
        }

        //获取表达式中的符号，进行计算
        for(int i=(length+1)/2; i<length; ++i){
            String operator=elements[i];
            //判断符号必须加减乘除
            boolean isValid= "+".equals(operator) || "-".equals(operator) || "*".equals(operator) || "/".equals(operator);

            if(!isValid){
                throw new RuntimeException("无效表达式:"+expression);
            }

            //获取集合中的数字,移除集合中第一个元素，并且返回
            long numbers1 = numbers.pollFirst();
            long numbers2=numbers.pollFirst();

            long result=0;
            if("+".equals(operator)){
                result=numbers1+numbers2;
            }else if("-".equals(operator)){
                result=numbers1-numbers2;
            }else if("*".equals(operator)){
                result=numbers1*numbers2;
            }else if("/".equals(operator)){
                result=numbers1/numbers2;
            }

            //将运算结果添加头部
            numbers.addFirst(result);
        }

        //运算最终结果是被保存集合中
        if(numbers.size() !=1){
            throw new RuntimeException("无效的表达式:"+expression);
        }

        //移除集合中唯一结果并返回
        return numbers.pop();
    }

}
