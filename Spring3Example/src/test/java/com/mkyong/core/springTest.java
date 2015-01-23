package com.mkyong.core;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * Created by sajith on 1/21/15.
 */
public class springTest {
    String name="Sajith Sunanda";
    String encodedString;
    String decodedString;
    EncodeString encode;
    EncodeString decode;

    @Before
    public void setUp(){
    System.out.println("Before Test Setup");
        encode= new EncodeString();
        decode= new EncodeString();
    }

    @Test
    public void testBase64Encode(){
        encodedString=encode.encodeString(name);
        System.out.println("Encoded : " +encodedString);

        try {
            System.out.println("Key : " +encode.genarateKey("Sajith"));
            System.out.println("UUID : " +String.valueOf(encode.generateUniqueId()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        decodedString=decode.decode(encodedString);
        System.out.println("Decoded  : "+decodedString);
        Assert.assertEquals(name,decodedString);
    }



}
