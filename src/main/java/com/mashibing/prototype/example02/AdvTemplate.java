package com.mashibing.prototype.example02;

/**
 * 广告类模版
 * */

public class AdvTemplate {

    //广告信名称
    private String advSubject="***银行本月还款达标之后，可抽iPhone13好礼！";

    //广告信内容
    private String advContext="达标用户请在2023年3月1日到2023年3月31日，参与抽奖。。。。。。";

    public AdvTemplate() {
    }

    public AdvTemplate(String advSubject, String advContext) {
        this.advSubject = advSubject;
        this.advContext = advContext;
    }

    public String getAdvSubject() {
        return advSubject;
    }

    public void setAdvSubject(String advSubject) {
        this.advSubject = advSubject;
    }

    public String getAdvContext() {
        return advContext;
    }

    public void setAdvContext(String advContext) {
        this.advContext = advContext;
    }

    @Override
    public String toString() {
        return "AdvTemplate{" +
                "advSubject='" + advSubject + '\'' +
                ", advContext='" + advContext + '\'' +
                '}';
    }
}
