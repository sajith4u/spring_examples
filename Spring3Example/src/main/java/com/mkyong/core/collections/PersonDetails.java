package com.mkyong.core.collections;

/**
 * Created by sajith on 1/22/15.
 */
public class PersonDetails {
    public  PersonDetails(int age,String name){
        this.age=age;
        this.name=name;
    }
    private String name;
    private  int age;

    public String getDetails(){
        return name +" : "+age;
    }
}
