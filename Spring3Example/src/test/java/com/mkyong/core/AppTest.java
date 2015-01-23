package com.mkyong.core;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }


    /**
     *  Test Junit Assertions
     */
    @org.junit.Test
    public void testAsertions(){
        String name= new String("Sajith");
        String name2= new String("Sajith");
        int age=27;
        int age1=28;
        assertEquals(name,name2);
        assertTrue(age<age1);

    }
}
