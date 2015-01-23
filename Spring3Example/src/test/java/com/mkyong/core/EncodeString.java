package com.mkyong.core;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/**
 * Created by sajith on 1/23/15.
 */
public class EncodeString {
    /**
     *  Encode using Base64
     * @param name
     * @return
     */
    public String encodeString(String name){
        byte[] encoded= Base64.encodeBase64(name.getBytes());
        String encode= new String(encoded);
        return encode;
    }

    public String decode(String decodedString){
        byte[] decoded=Base64.decodeBase64(decodedString);
        String decodedStri= new String(decoded);
        return decodedStri;
    }


    /**
     * Generate hash key
     * @param key
     * @return
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    public String genarateKey(String key) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String hashKey;
        MessageDigest messageDigest=MessageDigest.getInstance("SHA-256");
        byte[] hash=messageDigest.digest(key.getBytes("UTF-8"));

        StringBuilder hashbuild = new StringBuilder(2*hash.length);
        for(byte hashCode : hash){
            hashbuild.append(String.format("%02x", hashCode&0xff));
        }
        hashKey = hashbuild.toString();

        return hashKey;
    }

    /**
     * generate Unique ID for Authenticate
     */
    public Object generateUniqueId(){
        UUID id = java.util.UUID.randomUUID();
        return  id;
    }


}
