package com.advance.superclass;

import java.util.Scanner;

public class BikeFactoryImpl {

    public static void main(String[] args) {
        int i =0;

        while (i < 5) {
            int a, b, c;
            System.out.println(i);
            Scanner myInput = new Scanner(System.in);
            System.out.print("Gear: ");
            a = myInput.nextInt();
            System.out.print("Speed: ");
            b = myInput.nextInt();
            System.out.print("Seat Height: ");
            c = myInput.nextInt();

            MountainBike userBike = new MountainBike(a, b, c);
            System.out.println(userBike.toString());

            i++;

        }

        System.out.print("You have reached your limit: " + i);

    }

}
