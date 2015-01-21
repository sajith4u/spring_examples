package com.mkyong.core.events;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

/**
 * Created by sajith on 1/21/15.
 */
public class StopEvent implements ApplicationListener<ContextStoppedEvent>{

    @Override
    public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
        System.out.println("Stop Context Event");
    }
}
