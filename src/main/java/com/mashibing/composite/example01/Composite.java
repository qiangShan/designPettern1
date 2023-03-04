package com.mashibing.composite.example01;

//树枝节点：树枝节点是容器对象，它既可以包含树枝节点也可以包含叶子节点

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{

    //定义集合属性，保存子节点数据
    private List<Component> lists= new ArrayList<Component>();

    @Override
    public void add(Component component) {
        lists.add(component);
    }

    @Override
    public void remove(Component component) {
        lists.remove(component);
    }

    @Override
    public Component getChild(int i) {
        return lists.get(i);
    }

    //具体业务方法
    @Override
    public void operation() {

        //再循环中，递归调用其他节点中的operation()方法
        for(Component component:lists){
            component.operation();
        }
    }
}
