package com.aslam.classes;

// Abstract Class
public abstract class Animal implements Y {

    @Override
    public int b() {
        return 0;
    }

    private int color;
    private int bread;

    // Abstract Methods
    public abstract void makeSound();

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getBread() {
        return bread;
    }

    public void setBread(int bread) {
        this.bread = bread;
    }
}
