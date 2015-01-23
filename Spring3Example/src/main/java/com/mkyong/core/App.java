package com.mkyong.core;

import com.sajith.db.DatabaseTransactions;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.nio.file.*;
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
       /* CustomEventPublisher customEventPublisher= (CustomEventPublisher)context.getBean("customEventPublisher");
        customEventPublisher.publish();
        customEventPublisher.publish();
        customEventPublisher.publish();*/


        /**
         *  component Anotations
         */
       /* Organization organization=(Organization)context.getBean("organization");
        organization.partyStartTime();

        Person person=(Person)context.getBean("person");
        person.partyStartTime();*/

        /**
         *  HashMap example
         */

       /* HashMapExample hashMapExample= new HashMapExample();
        HashMap<Integer,PersonDetails>details = hashMapExample.add();
        System.out.println(details.get(1).getDetails());*/


        /**
         * Enum Example
         */
        /*EnumExample enumExample= new EnumExample();
        enumExample.setState(EnumExample.NetworkState.SUCCESS);
        System.out.println(enumExample.getState());*/

        /**
         * Unit Testing example
         */
       /* UnitTesting unitTesting= new UnitTesting();
        unitTesting.printTestmMessage("Sajith");*/








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

    public void waitforFile() throws IOException,
            InterruptedException {
        Path faxFolder = Paths.get("/home/sajith/tmp/juju/tmpcheck");
        WatchService watchService = FileSystems.getDefault().newWatchService();
        faxFolder.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

        boolean valid = true;
        do {
            WatchKey watchKey = watchService.take();

            for (WatchEvent event : watchKey.pollEvents()) {
                WatchEvent.Kind kind = event.kind();
                if (StandardWatchEventKinds.ENTRY_CREATE.equals(event.kind())) {
                    String fileName = event.context().toString();
                    System.out.println("File Created:" + fileName);
                }else{

                }
            }
            valid = watchKey.reset();

        } while (valid);

    }
}
