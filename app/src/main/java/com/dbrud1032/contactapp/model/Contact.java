package com.dbrud1032.contactapp.model;

public class Contact {

    public String name;
    public String phone;

    public int id;

    // 디폴트 생성자
    public Contact(){

    }

    // 생성자 오버로드
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }


    public Contact(int id ,String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}
