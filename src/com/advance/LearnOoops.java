package com.advance;

public class LearnOoops {

    public static void main(String[] args) {

        Dog kilo = new Dog();
        kilo.setName("Kilo Sams");
        kilo.setHeight(2.0);
        kilo.setType("Dog");
        kilo.setGender("Male");
        System.out.println("Animal: " + kilo.getType());
        System.out.println("Name: " + kilo.getName());
        System.out.println("Height: " + kilo.getHeight());
        System.out.println("Gender: " + kilo.getGender());


        Cat sakura = new Cat();
        sakura.setName("Sakura Sams");
        sakura.setHeight(2.0);
        sakura.setType("Cat");
        sakura.setGender("Female");
        System.out.println("Animal: " + sakura.getType());
        System.out.println("Name: " + sakura.getName());
        System.out.println("Height: " + sakura.getHeight());
        System.out.println("Gender: " + sakura.getGender());

    }

}
