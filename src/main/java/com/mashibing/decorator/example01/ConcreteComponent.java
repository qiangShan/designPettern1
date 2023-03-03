package com.mashibing.decorator.example01;

import com.mashibing.decorator.example01.Component;

/**
 * 具体构建类，被装饰类
 * */

public class ConcreteComponent extends Component {

    @Override
    public void operation() {
        //基础功能的实现（一些复杂的功能通过装饰类进行扩展）
    }
}
