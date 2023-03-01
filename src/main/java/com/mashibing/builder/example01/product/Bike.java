package com.mashibing.builder.example01.product;

/**
 * 自行车类
 * */

public class Bike {

    private String frame;  //车架

    private String seat;  //车座

    public Bike() {
    }

    public String getFrame() {
        return frame;
    }

    public Bike(String frame, String seat) {
        this.frame = frame;
        this.seat = seat;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
