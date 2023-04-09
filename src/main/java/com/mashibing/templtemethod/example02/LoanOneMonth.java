package com.mashibing.templtemethod.example02;

/**
 * 借款一个月
 * */

public class LoanOneMonth extends Account{
    @Override
    public void calculate() {
        System.out.println("借款周期30天,利息为总额的 10%");
    }

    @Override
    public void diplay() {
        System.out.println("30日内借款内利息为总金额的 10%");
    }
}
