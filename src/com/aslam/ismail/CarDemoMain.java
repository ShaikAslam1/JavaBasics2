package com.aslam.ismail;

public class CarDemoMain {
    public static void main(String[] args) {
        CarDemo a = new CarDemo(50, 5, 500);
        System.out.println(a.getCadence());
        System.out.println(a.getSpeed());
        System.out.println(a.getGear());

        String s = "abcd";

        a.speedUp(50);
        a.applyBreak(10);
        System.out.println(a.getSpeed());

        System.out.println(a.toString());

        Object obj = new ElectricCar(); // implicit casting

        ElectricCar electricCar = (ElectricCar) obj; // explicit casting

        CarDemo.staticMethod();

        electricCar.printCadence();

        // equals
        CarDemo a2 = new CarDemo(50, 5, 500);
        CarDemo a3 = new CarDemo(50, 5, 500);

        if (a3.equals(a2) && (a3.hashCode() == a2.hashCode()))
            System.out.println("equal");
        else
            System.out.println("not equal");

        System.out.println(a2.getClass());

    }

}
