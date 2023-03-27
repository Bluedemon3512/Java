package com.chapter5;

import java.util.Scanner;

public class Loop_Control_Instruction {
    public static void main(String[] args) {
        // for loop
        Scanner su = new Scanner(System.in);
        System.out.println("Enter number which table you want print with help of for loop");
        int a = su.nextInt();
        for (int i = 1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",a,i,a*i);
        }
        // while loop
        System.out.println("Enter number which table you want print with help of while loop");
        int b = su.nextInt();
        int i = 1;
        while (i<=10){
            System.out.printf("%d X %d = %d\n",b,i,b*i);
            i++;
        }
        // do-while loop

        System.out.println("Enter number which table you want print");
        int c = su.nextInt();
        i = 1;
        do {

            System.out.printf("%d X %d = %d\n",c,i,c*i);
            i++;
        }
        while (i<=10);

    }
}
