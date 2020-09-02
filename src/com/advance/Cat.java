package com.advance;

public class Cat extends Animal {

    private double height;

    @Override
    public double getHeight() {
        return height;
    }
    @Override
    public void setHeight(double height) {
        this.height = height;
    }

}
