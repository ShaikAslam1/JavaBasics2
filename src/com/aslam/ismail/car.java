package com.aslam.ismail;

public class car {
     public int car = 30; // instance//
 static  int car5 = 90;
    public static void main(String[] args) {
        int car3 = 50; // local //
        System.out.println(car3);
int car2 = 40; // local//
        car car = new car();// object for non static instance//
        System.out.println(car.printcar());
        System.out.println(car2);

    }

public int printcar() {return car;}

}
