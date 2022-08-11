package com.aslam.ismail;

public class BikeMain {
    public static void main(String[] args) {
        Bike a = new Bike(50,500,5);
        System.out.println(a.getCadence());
        System.out.println(a.getSpeed());
        System.out.println(a.getGear());

        a.Speedup(50);
        System.out.println(a.getSpeed());
        a.applyBrake(100);
        System.out.println(a.getSpeed());
        System.out.println(a.gear);



    }




}
