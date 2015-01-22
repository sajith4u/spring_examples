package com.mkyong.core.annotations;

import org.springframework.stereotype.Component;

/**
 * Created by sajith on 1/22/15.
 */
@Component
public class Person implements Party {
    @Override
    public void partyStartTime() {
        System.out.println("Starting in 7.30");
    }
}
