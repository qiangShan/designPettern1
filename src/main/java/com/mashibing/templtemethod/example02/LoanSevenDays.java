package com.mashibing.templtemethod.example02;

/**
 * 借款七天
 * */

public class LoanSevenDays extends Account{

    @Override
    public void calculate() {
        System.out.println("借款周期七天,无利息！仅收取贷款金额的 1% 的服务费");
    }

    @Override
    public void diplay() {
        System.out.println("七日内借款内无利息");
    }
}
