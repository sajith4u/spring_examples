package com.mkyong.core.customEvent;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by sajith on 1/21/15.
 */
public class CustomEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
     this.applicationEventPublisher=applicationEventPublisher;
    }

    public void publish(){
        CustomEvent customEvent= new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
    }
}
