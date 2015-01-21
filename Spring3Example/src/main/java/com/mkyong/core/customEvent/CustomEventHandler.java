package com.mkyong.core.customEvent;

import org.springframework.context.ApplicationListener;

/**
 * Created by sajith on 1/21/15.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
