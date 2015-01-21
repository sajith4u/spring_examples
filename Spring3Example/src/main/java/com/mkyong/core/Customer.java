package com.mkyong.core;

/**
 * Created by sajith on 1/21/15.
 */
public class Customer {
    private int cusId;
    private String name;

    public int getCusId() {
        return cusId;
    }

    public void setCusId(int cusId) {
        this.cusId = cusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public Customer(int id,String name,int age){
        this.cusId=id;
        this.name=name;
        this.age=age;

    }
}
