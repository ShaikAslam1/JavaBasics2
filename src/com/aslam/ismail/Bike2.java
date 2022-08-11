package com.aslam.ismail;

public class Bike2 {

    final static float pi = 3.14f;

    // Class Variables
    static int speed;
    byte a = 12;
    char b = '@';
    boolean saddam = false;
    //TODO
    // Bike.speed= 3;

    // Instance Variables
    // Global variable
    int gear;
    //TODO
    // gear =5;

    // Methods
    public int changeGear(int g) {

        // local variables
        // Declaration
        int oldGearValue;

        // initialization
        oldGearValue = gear;
        oldGearValue = oldGearValue + g;
        gear = oldGearValue;
        return gear;
    }

    public int squareArea(int s1, int s2, int s3, int s4) {
        return s1 * s2 * s3 * s4;
    }
}
