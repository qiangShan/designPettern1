package com.mashibing.decorator.example01;

import com.mashibing.decorator.example01.Component;

/**
 * 抽象装饰类，装饰者模式核心
 * */

public class Decorator extends Component {

    //维持一个对抽象构建对象的引用
    private Component component;

    //通过构造注入一个抽象构建类的对象
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        //调用原有的业务方法，并没有进行装饰，而是提供了一个统一接口，将装饰过程提交给子类
        component.operation();
    }
}
