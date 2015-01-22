package com.mkyong.core.annotations;

import org.springframework.stereotype.Component;

/**
 * Created by sajith on 1/22/15.
 */
@Component
public class Organization implements Party {
    @Override
    public void partyStartTime() {
        System.out.println("Start in 9.30");
    }
}
