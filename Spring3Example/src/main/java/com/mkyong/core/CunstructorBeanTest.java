package com.mkyong.core;

/**
 * Created by sajith on 1/21/15.
 */
public class CunstructorBeanTest {
    int id, age;
    String name;

    public CunstructorBeanTest(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void PrintMessage() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Id : " + id);
    }
}
