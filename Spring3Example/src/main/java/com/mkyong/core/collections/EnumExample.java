package com.mkyong.core.collections;

/**
 * Created by sajith on 1/22/15.
 */
public class EnumExample {
    public enum NetworkState{
        SUCCESS,FAILURE,PENDING
    }

    public NetworkState getState() {
        return state;
    }

    public void setState(NetworkState state) {
        this.state = state;
    }

    private NetworkState state;

}
