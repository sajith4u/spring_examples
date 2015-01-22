package com.mkyong.core.collections;

import java.util.*;

/**
 * Created by sajith on 1/22/15.
 */
public class HashMapExample implements Functions  {
    private HashMap<Integer,PersonDetails> integerObjectsMap= new HashMap<Integer, PersonDetails>();

    @Override
    public HashMap<Integer, PersonDetails> add() {
        integerObjectsMap.put(1,new PersonDetails(12, "Sajith"));
        integerObjectsMap.put(2,new PersonDetails(12,"Sunanda"));
        integerObjectsMap.put(3,new PersonDetails(12,"Vijesekara"));
        return integerObjectsMap;
    }

    @Override
    public HashMap<Integer, PersonDetails> subtract() {
        return null;
    }

    @Override
    public HashMap<Integer, PersonDetails> devide() {
        return null;
    }
}
