package com.advance.superclass;

public class Sub_Class extends Super_Class {

    int num = 20;

    public void display() {
        System.out.println("This is the display method of subclass");
    }

    public void my_method() {
        Sub_Class sub = new Sub_Class();
        sub.display();
        super.displayHQ();

        System.out.println("Value of the variable named num in sub class: " + sub.num);
        System.out.println("Value od the variable named num in super class: " + super.num);
    }


}
