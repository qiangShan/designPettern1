package com.mashibing.mediator.example02;

/**
 * 具体中介者:中介机构
 * */

public class MediatorStructure extends Mediator{

    //中介知晓房屋出租人和租房人信息
    private HouseOwner houseOwner;  //房主
    private Tenat  tenat;  //租房者

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenat getTenat() {
        return tenat;
    }

    public void setTenat(Tenat tenat) {
        this.tenat = tenat;
    }

    @Override
    public void contact(String message, Person person) {
        //如果是房东，则租房者获得信息
        if(person ==houseOwner){
            tenat.getMessage(message);
        }else{
            //如果是租房者，则房东获得信息
            houseOwner.getMessage(message);
        }
    }
}
