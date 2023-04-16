package com.mashibing.visitor.example01;

import java.time.LocalDate;

/**
 * 商品抽象父类
 *
 * */

public class Product {

    private String name;  //商品名

    private LocalDate productDate;  //商品生产日期

    private double price;   //商品价格

    public Product(String name, LocalDate productDate, double price) {
        this.name = name;
        this.productDate = productDate;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productDate=" + productDate +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getProductDate() {
        return productDate;
    }

    public void setProductDate(LocalDate productDate) {
        this.productDate = productDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
