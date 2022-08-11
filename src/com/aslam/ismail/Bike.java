package com.aslam.ismail;

public class Bike {
    // Fields//
    public int cadence;
    public int gear;
    private int speed;
    private int a;

    //The Bike has one Constructor//
    public Bike(int StartCadence, int StartSpeed, int StartGear) {
        this.cadence = StartCadence;
        this.gear = StartGear;
        this.speed = StartSpeed;
    }

    // Default CONSTRUCTOR//
    public Bike() {}

    public Bike(int cadence, int speed, int gear, int a) {
        this(cadence, speed, gear);
        this.a = a;
    }

    //The Bike has four Methods//
    //Set Methods//
    public void SetCadence(int NewValue) {
        cadence = NewValue;
    }

    public void SetGear(int NewValue) {
        gear = NewValue;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void Speedup(int increment) {
//        speed = speed + increment;
        speed += increment;
    }

    public int getCadence() {
        return cadence;

    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {

        return speed;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
