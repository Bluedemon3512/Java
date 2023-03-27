package com.chapter4;

import java.util.Scanner;

public class If_Else_Statement {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = su.nextInt();
        if (age < 18 && age>=0) {
            System.out.println("You can`t apply for  driving  lincance ");

        } else if (age>=18 && age<=50) {
            System.out.println("You can apply for driving lincance");
        }
        else if (age>50&&age<=120){
            System.out.println("You need medical cerficate for driving lincance ");
        }
        else {
            System.out.println("Please enter a valide age");
        }
    }
}
