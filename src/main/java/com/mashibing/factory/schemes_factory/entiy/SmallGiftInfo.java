package com.mashibing.factory.schemes_factory.entiy;

/**
 * 小礼品实体类
 *
 * */

public class SmallGiftInfo {

    private String userName;

    private String userPhone;

    private String orderId;

    private String address;

    public SmallGiftInfo() {

    }

    public SmallGiftInfo(String userName, String userPhone, String orderId, String address) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.orderId = orderId;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "SmallGiftInfo{" +
                "userName='" + userName + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", orderId='" + orderId + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
