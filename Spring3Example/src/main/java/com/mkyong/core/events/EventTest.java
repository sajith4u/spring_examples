package com.mkyong.core.events;

/**
 * Created by sajith on 1/21/15.
 */
public class EventTest {
    private  String name;

    public String getName() {
        System.out.println("Spring Event Test : " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
