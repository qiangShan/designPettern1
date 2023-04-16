package com.mashibing.visitor.example01;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Client {

    @Test
    public void test01(){

        Candy candy=new Candy("德芙巧克力", LocalDate.of(2023,4,1),18.90);
        Visitor visitor=new DiscountVisitor(LocalDate.of(2023,5,15));
        visitor.visit(candy);
    }

    @Test
    public void test02(){
        //将所有商品加入购物车
        List<Product> products= Arrays.asList(
                new Candy("金丝猴奶糖",LocalDate.of(2023,4,1),25.69),
                new Wine("贵州茅台酒",LocalDate.of(2023,3,18),2399.00),
                new Fruit("芒果",LocalDate.of(2023,04,15),10.09,3.80)
        );

        Visitor visitor=new DiscountVisitor(LocalDate.of(2023,5,15));

        for(Product product:products){
            //visitor.visit(product);
        }
    }

    @Test
    public void test03(){
        //模拟添加多个商品
        List<Acceptable> list= Arrays.asList(
                new Candy("金丝猴奶糖",LocalDate.of(2023,4,1),25.69),
                new Wine("贵州茅台酒",LocalDate.of(2023,3,18),2399.00),
                new Fruit("芒果",LocalDate.of(2023,04,15),10.09,3.80)
        );

        Visitor visitor = new DiscountVisitor(LocalDate.of(2023, 04, 22));

        for (Acceptable product :list) {
            product.accept(visitor);
        }
    }
}
