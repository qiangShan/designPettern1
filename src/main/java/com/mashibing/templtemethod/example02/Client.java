package com.mashibing.templtemethod.example02;

public class Client {

    public static void main(String[] args) {
        Account sevenDays=new LoanSevenDays();
        sevenDays.handler("qiangShan","131457dan");
        System.out.println("------------------------------------------");

        Account loanOneMonth = new LoanOneMonth();
        loanOneMonth.handler("qiangShan","131457dan");

    }
}
