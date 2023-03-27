package com.chapter1;

import java.util.Scanner;

public class Marks_Percantage_Calculator {
    public static void main(String[] args) {

        Scanner su = new Scanner(System.in);

        System.out.println("Exam Percentage Calculator");

        System.out.println("Enter total number in a subject");
        int t = su.nextInt();
         t= t*5;

        System.out.println("Enter number of 1'st subject");
         int a = su.nextInt();
        System.out.println("Enter number of 2'st subject");
        int b = su.nextInt();
        System.out.println("Enter number of 3'st subject");
        int c = su.nextInt();
        System.out.println("Enter number of 4'st subject");
        int d = su.nextInt();
        System.out.println("Enter number of 5'st subject");
        int e = su.nextInt();

        int total = (a+b+c+d+e);
     int     total1 = total*100;

      float  pre = (float) total1/t;


        System.out.println("Total Percentage out of "+total+" is = "+pre);
    }
}
