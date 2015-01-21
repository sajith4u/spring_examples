package com.mkyong.core;

import org.springframework.beans.factory.annotation.Required;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by sajith on 1/21/15.
 */
public class CollectionInjection {
    List addressList;
    Set  addressSet;
    Map  addressMap;
    Properties addressProp;

    public List getAddressList() {
        System.out.println("LIST : " + addressList);
        return addressList;
    }

    @Required
    public void setAddressList(List addressList) {
        this.addressList = addressList;
    }

    public Set getAddressSet() {
        System.out.println("SET : "+addressSet);
        return addressSet;
    }

    @Required
    public void setAddressSet(Set addressSet) {
        this.addressSet = addressSet;
    }

    public Map getAddressMap() {
        System.out.println("MAP : "+addressMap);
        return addressMap;
    }

    @Required
    public void setAddressMap(Map addressMap) {
        this.addressMap = addressMap;
    }

    public Properties getAddressProp() {
        System.out.println("PROPERTIES : "+addressProp);
        return addressProp;
    }

    @Required
    public void setAddressProp(Properties addressProp) {
        this.addressProp = addressProp;
    }
}
