package com.aslam.ismail;

public class ElectricCar extends CarDemo {
    private int cadence;

    public static void staticMethod() {
        System.out.println("static method:: Electric car");
    }

    public void printCadence() {
        cadence = 10;
        super.setCadence(13);
        System.out.printf("subclass cadence %d and super class cadence %d",cadence, super.getCadence());
    }

}
