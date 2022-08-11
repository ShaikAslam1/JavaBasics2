package com.aslam.ismail;

import java.util.Objects;

public class CarDemo {
    // the car has 3 fields//
    private int cadence;
    public int gear;
    public int speed;

    // the car counstructor//
    public CarDemo(int startCadence, int startGear, int startSpeed) {
        cadence = startCadence;
        gear = startGear;
        speed = startSpeed;

    }

    public CarDemo() {
    }

    //the car has 4 methods//
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void applyBreak(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
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

    @Override
    public String toString() {
        return "CarDemo{" +
                "cadence=" + cadence +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDemo carDemo = (CarDemo) o;
        return cadence == carDemo.cadence && gear == carDemo.gear && speed == carDemo.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cadence, gear, speed);
    }

    public static void staticMethod() {
        System.out.println("Static Method:: CarDemo");
    }
}