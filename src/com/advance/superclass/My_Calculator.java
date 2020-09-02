package com.advance.superclass;

import java.util.Scanner;

public class My_Calculator {

    public static void main(String[] args) {

        int i =0;

        while (i <5) {

            System.out.println(i);
            Scanner myInput = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int a = myInput.nextInt();
            System.out.print("Enter a number: ");
            int b = myInput.nextInt();

            My_Calculation marissa = new My_Calculation();
            marissa.addition(a, b);
            marissa.subtraction(a, b);
            marissa.multiplication(a, b);

            i++;
        }

        System.out.print("You have reached your limit: " + i);

    }

}
