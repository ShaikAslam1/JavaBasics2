package com.aslam;

public class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }

   // public static void main(String[] args) {
        //Animal d1 = new Animal();
        d1.displayInfo();//

    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }
}

