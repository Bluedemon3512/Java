package com.chapter3;

import java.nio.charset.StandardCharsets;

public class String_Method {
    public static void main(String[] args) {
        String name = "Gagan";
//        System.out.println(name);
//       int value = name.length();
//        System.out.println(String.valueOf(value));
//
    String    nonTrimmedString = "    Gagan     ";
//        System.out.println(nonTrimmedString);
//        System.out.println(nonTrimmedString.trim());
//        System.out.println(name.substring(3));
//
//        System.out.println(name.startsWith("Gag"));
//        System.out.println(name.endsWith("an"));
//        System.out.println(name.charAt(2));
//        System.out.println(name.getBytes(StandardCharsets.UTF_8));
//        System.out.println(name.concat(nonTrimmedString));





//        System.out.println(name.indexOf("an"));


     String modifiedName = "Gagagagan";
        System.out.println(modifiedName.indexOf("ga",5
        ));
//        System.out.println(name.equals("Gagan"));
        System.out.println(name.equalsIgnoreCase("gagan"));
        System.out.println("I am escape sequence \\ charector");
        System.out.println("I am escape sequence \" charector");
    }



}
