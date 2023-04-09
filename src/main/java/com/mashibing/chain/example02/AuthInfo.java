package com.mashibing.chain.example02;

/**
 * 封装审核信息
 * */

public class AuthInfo {

    private String code;  //状态码
    private String info="";  //审核相关信息

    public AuthInfo(String code, String ... infos) {
        this.code = code;
        for(String info:infos){
            this.info=this.info.concat(info+"");
        }
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "AuthInfo{" +
                "code='" + code + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
