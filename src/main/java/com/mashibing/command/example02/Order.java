package com.mashibing.command.example02;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单类
 * */

public class Order {

    private Integer diningTable;  //餐桌号码

    private Map<String,Integer> foodMenu=new HashMap<>();    //存储菜名和份数



    @Override
    public String toString() {
        return "Order{" +
                "diningTable=" + diningTable +
                ", foodMenu=" + foodMenu +
                '}';
    }

    public Integer getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(Integer diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodMenu() {
        return foodMenu;
    }

    public void setFoodMenu(Map<String, Integer> foodMenu) {
        this.foodMenu = foodMenu;
    }
}
