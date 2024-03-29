package com.mashibing.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 该类用来存储和遍历多个PropertyValue对象
 * */

public class MutablePropertyValues implements Iterable<PropertyValue>{

    //定义一个集合，存储PropertyValue
    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList=new ArrayList<>();
    }

    //有参构造方法，接收一个外部传入的List,赋值给propertyValueList属性
    public MutablePropertyValues(List<PropertyValue> propertyValueList) {

        if(propertyValueList == null){
            this.propertyValueList=new ArrayList<>();
        }else{
            this.propertyValueList = propertyValueList;
        }
    }


    //获取当前容器对应的迭代器对象
    @Override
    public Iterator<PropertyValue> iterator() {
        //直接获取List集合对应的迭代器
        return propertyValueList.iterator();
    }


    //获取所有的PropertyValue
    public PropertyValue[] getPropertyVaules(){
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    //根据name属性获取PropertyValue
    public PropertyValue getPropertyValue(String propertyName){
        for (PropertyValue propertyValue : propertyValueList) {
            if(propertyValue.getName().equals(propertyName)){
                return propertyValue;
            }
        }

        return null;
    }

    //判断集合是为空
    public boolean isEmpty(){
        return propertyValueList.isEmpty();
    }

    //像集合中添加元素
    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue){
        //判断集合中存储的PropertyValue对象，是否存在重复，重复就覆盖
        for(int i=0; i<propertyValueList.size(); i++){
            //获取集合中的PropertyValue
            PropertyValue currentPv = propertyValueList.get(i);

            //判断当前的Pv的name属性，是否与传入相同，如果相同就覆盖
            if(currentPv.getValue().equals(propertyValue.getName())){
                propertyValueList.set(i,propertyValue);
                return this;
            }
        }

        //没有重复，直接添加
        this.propertyValueList.add(propertyValue);
        return this;  //目的实现链式编程
    }

    //判断是否有指定的name属性值的对象
    public boolean contains(String name){
        return getPropertyValue(name)!=null;
    }

    @Override
    public String toString() {
        return "MutablePropertyValues{" +
                "propertyValueList=" + propertyValueList +
                '}';
    }
}
