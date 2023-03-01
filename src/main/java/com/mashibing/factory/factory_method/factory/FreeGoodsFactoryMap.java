package com.mashibing.factory.factory_method.factory;

import com.mashibing.factory.factory_method.factory.impl.DiscountIFreeGoodsFactory;
import com.mashibing.factory.factory_method.factory.impl.SmallIFreeGoodsFactory;
import com.mashibing.factory.factory_method.factory.impl.YouKuMemberIFreeGoodsFactory;

import java.util.HashMap;
import java.util.Map;

/**
 *  工厂的工厂，用来创建工厂类对象
 *
 * */

public class FreeGoodsFactoryMap {

    //创建一个map集合，保存工厂对象
    private static final Map<Integer,FreeGoodsFactory> cachedFactories=new HashMap<Integer,FreeGoodsFactory>();

    static{
        cachedFactories.put(1,new DiscountIFreeGoodsFactory());
        cachedFactories.put(3,new SmallIFreeGoodsFactory());
        cachedFactories.put(2,new YouKuMemberIFreeGoodsFactory());
    }

    public static FreeGoodsFactory getParserFactory(Integer type){

        if(type == 1){
            FreeGoodsFactory freeGoodsFactory = cachedFactories.get(1);
            return freeGoodsFactory;
        }else if(type == 3){
            FreeGoodsFactory freeGoodsFactory = cachedFactories.get(3);
            return freeGoodsFactory;
        }else if(type ==2){
            FreeGoodsFactory freeGoodsFactory = cachedFactories.get(2);
            return freeGoodsFactory;
        }

        return  null;
    }
}
