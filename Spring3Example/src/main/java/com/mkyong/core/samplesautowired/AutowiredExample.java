package com.mkyong.core.samplesautowired;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by sajith on 1/21/15.
 */
public class AutowiredExample {


    private Details details;
    @Autowired
    public AutowiredExample(Details d){
        this.details=d;

    }
    public Details getDetails() {
        return details;
    }

    /*@Autowired
    public void setDetails(Details details) {
        this.details = details;
    }*/

    public void Print(){
        details.details();
    }


}
