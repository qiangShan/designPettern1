package com.mashibing.factory.schemes01.entiy;

/**
 * 打折券响应信息
 *
 * */
public class DiscountResult {

    private  String status; // 状态码

    private String message;  //信息

    public DiscountResult() {
    }

    public DiscountResult(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "DiscountResult{" +
                "status='" + status + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
