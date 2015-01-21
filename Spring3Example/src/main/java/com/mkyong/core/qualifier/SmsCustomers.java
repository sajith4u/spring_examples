package com.mkyong.core.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by sajith on 1/21/15.
 */
public class SmsCustomers {
   @Autowired
   @Qualifier("dialog_product")
   private Product product;
   public SmsCustomers(){

   }
    public void PrintProductName(){
        System.out.println("NAME : " + product.getProductName());

    }
    public void PrintProductCode(){
        System.out.println("CODE : "+product.getProductCode());
    }
    public void PrintProductId(){
        System.out.println("ID : "+product.getId());
    }


}
