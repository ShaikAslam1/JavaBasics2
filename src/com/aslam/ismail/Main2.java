package com.aslam.ismail;

public class Main2 {

    public static void main(String[] args) {

        // Setting values using setters
        Bicycle b = new Bicycle();
        b.setCadence(9);
        b.setGear(6);
        b.setSpeed(100);

        System.out.println(b.classMethod());

        int[] values = {1,2,3};

        b.setValues(values);

        System.out.println(b.getCadence());
        System.out.println(b.getSpeed());
        System.out.println(b.getGear());

        System.out.println("=================");

        // Setting values using Constructor
        Bike2 bike = new Bike2();
        Bicycle b2 = new Bicycle(2, 3, 4, 5, bike);

        System.out.println(b2.getCadence());
        System.out.println(b2.getSpeed());
        System.out.println(b2.getGear());

        System.out.printf("%s%n", String.valueOf(b2.getCadence()));
        System.out.printf("%s%n", "aslam");

        // creating object using method
        Bicycle b3 = new Bicycle(4, 7, 8, 6, bike);
        Bicycle b4 = b2.createBicycle(b3);

        System.out.println(b4.getCadence());
        System.out.println(b4.getSpeed());
        System.out.println(b4.getGear());

        // class variable value is same across all objects
        /*System.out.println(b2.getCommonVariable());
        System.out.println(b3.getCommonVariable());
        System.out.println(b.getCommonVariable());
        System.out.println(b4.getCommonVariable());*/

        Bicycle.commonVariable = 4;

        System.out.println(b2.getCommonVariable());
        System.out.println(b3.getCommonVariable());
        System.out.println(b.getCommonVariable());
        System.out.println(b4.getCommonVariable());

        System.out.println(b4.classMethod());

        System.out.println(Bicycle.classMethod());

        double pi = b4.PI;
        System.out.println(pi);
//        b4.PI = 4.657;

        // nested class
        Bicycle.MountainBike m = b.new MountainBike();
        m.setSpeed(200);
        m.setChain(65);

        // static class
        Bicycle.StaticClass s = new Bicycle.StaticClass();
        s.setA(2);
        s.setB(5);

    }
}
