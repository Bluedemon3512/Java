package com.chapter2;

public class Operators {
    public static void main(String[] args) {
        int a = 4;
        int b = 6+a;
        System.out.println(b);
       int c= 6-a;

        System.out.println(c);
        int d = b%a;
        System.out.println(d);

        b +=3;
        b++;
        System.out.println(b);
        System.out.println(b==a);

        System.out.println(a>b&&a>c);
        System.out.println(a>b||a>c);
        boolean boo =  false;
        System.out.println(!boo);

        System.out.println(2&3);
    }
}
