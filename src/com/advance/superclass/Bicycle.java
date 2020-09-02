package com.advance.superclass;

public class Bicycle {

    // the Bicycle class has two fields
    public int gear;
    public int speed;

    // the Bicycle class has one constructor
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    // the Bicycle class has three methods
    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUP(int increment) {
        speed += increment;
    }

    public String toString() {
        return("Number of gears are " + gear + "\nSpeed of bicycle is " + speed);
    }




}
