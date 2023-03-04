package com.mashibing.composite.example01;

//叶子节点

public class Leaf extends Component{
    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        //叶子节点中具体方法

    }
}
