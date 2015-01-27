package com.mkyong.core.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sajith on 1/27/15.
 */
public class RegexExample {

    /**
     * Regex matches example
     */
    public void regexMatches() {
        List<String> names = new ArrayList<String>();
        names.add("192.168.0.112");
        names.add("192.168.0.113");
        names.add("192.168.0.114");
        names.add("192.168.0.115.555");

        for (String name : names) {
            if (name.matches("^(\\d{3}.?\\d{3}.?\\d{1}.?\\d{3})$")) {
                System.out.println("Mathes :" + name);
            }
        }

    }

    /**
     * Regex Find example
     */
    public void regexFindExample() {
        String paragraph = "I love java but i love linux now i love both ubuntu and linux";
        Pattern pattern = Pattern.compile("(java|ubuntu|linux)");
        Matcher matcher = pattern.matcher(paragraph);
        List<String> match = new ArrayList<String>();
        while (matcher.find()) {
            match.add(matcher.group());
            System.out.println("Found : " + matcher.group());

        }

    }

    /**
     * Find and replace String in paragraph in regex
     */
    public void findAndReplaceRegex() {
        String sql = "Select * from people where id=123456 and m.id=1256 and name = sajith";
        Pattern findPattern = Pattern.compile("(id=)(\\d{6})");
        Matcher matcher = findPattern.matcher(sql);
        StringBuffer stringBuilder = new StringBuffer();

        while (matcher.find()) {
            matcher.appendReplacement(stringBuilder, matcher.group(1) + "My value");
        }
        matcher.appendTail(stringBuilder);
        System.out.println(stringBuilder);

    }

    /**
     *  check decimal valus.
     */
    public void checkDecimal(){
        List<String> names = new ArrayList<String>();
        names.add("1.16");
        names.add("192.16");
        names.add("156");
        names.add("8.23");
        names.add("0.0095");
        names.add("a.0095");
        names.add("155.saj");
        names.add("saj");
        names.add("sajith.viesekara@gmail.com");

        String matcher="^([1-8]+(\\.\\d+))$";  // range digits between 1-8
        String matcher1="^([a-z]+(\\.\\d+))$";
        String matcher2="^([a-zA-Z]{3})";
        String matcher3="^[-0-9a-zA-Z.+_]+@[-0-9a-zA-Z.+_]+\\.[a-zA-Z]{2,4}";

        for (String name : names) {
            if (name.matches(matcher3)) {
                System.out.println("Mathes :" + name);
            }
        }

    }


}
