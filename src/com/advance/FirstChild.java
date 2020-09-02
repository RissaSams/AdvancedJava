package com.advance;

public class FirstChild extends ParentClass {

    void FirstChild() {
        System.out.println("Constructor of Child");
    }

    void disp () {
        System.out.println("Child Method");
        super.disp();
    }

}
