package com.mkyong.core.collections;

/**
 * Created by sajith on 1/23/15.
 */
public class UnitTesting extends Testing {
    @Override
    public void printTestmMessage(String name) {
        System.out.println("=================== Unit Testing =========================");
        System.out.println("===================  "+name+" ============================");
    }
}
