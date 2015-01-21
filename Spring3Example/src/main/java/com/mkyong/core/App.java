package com.mkyong.core;

import com.mkyong.core.customEvent.CustomEventPublisher;
import com.sajith.db.DatabaseTransactions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class App {
	public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");

		/*HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();*/

       /* CunstructorBeanTest cunstructorBeanTest= (CunstructorBeanTest) context.getBean("beanTest");
        cunstructorBeanTest.PrintMessage();*/


        /*AutowiredExample autowiredExample= (AutowiredExample)context.getBean("auto1");
        autowiredExample.Print();*/


       /* SmsCustomers smsCustomers=(SmsCustomers)context.getBean("custom_product");
        smsCustomers.PrintProductCode();
        smsCustomers.PrintProductName();
        smsCustomers.PrintProductId();*/


        /**
         *  Event Handle
         */

        /*context.start();
        EventTest eventTest= (EventTest) context.getBean("event_test");
        eventTest.getName();
        context.stop();
        */


        /**
         *  Custom Event
         */
        CustomEventPublisher customEventPublisher= (CustomEventPublisher)context.getBean("customEventPublisher");
        customEventPublisher.publish();
        customEventPublisher.publish();
        customEventPublisher.publish();

	}


    /**
     *  All Db related codes
     * @param context
     */
    public void DbTransActions(ApplicationContext context){
        DatabaseTransactions databaseTransactions= (DatabaseTransactions)context.getBean("customerDAO");
        Customer customer = new Customer(22, "Vijesekara", 50);
        databaseTransactions.insert(customer);

        Customer customer1= databaseTransactions.findId(22);
        System.out.println("Name : "+customer1.getName());
        System.out.println("ID : "+customer1.getCusId());
        System.out.println("Age : "+customer1.getAge());
    }


    /**
     *  All collections related codes
     * @param context
     */
    public void colelctionExamples(ApplicationContext context){
        CollectionInjection collectionInjection=(CollectionInjection) context.getBean("collection");

        List names= collectionInjection.getAddressList();
        collectionInjection.getAddressMap();
        collectionInjection.getAddressSet();
        collectionInjection.getAddressProp();
    }
}
