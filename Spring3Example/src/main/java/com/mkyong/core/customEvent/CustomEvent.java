package com.mkyong.core.customEvent;

import org.springframework.context.ApplicationEvent;

/**
 * Created by sajith on 1/21/15.
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "Fire Custom Event";
    }

}
