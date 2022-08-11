package com.aslam.ismail;

import java.sql.SQLOutput;

public class SportsCarDemoMain {
    public static void main(String[] args) {
        SportsCarDemo c = new SportsCarDemo
                (20.5,50,100.5,5,"Ismail");
        System.out.println(c.getSeatHeight());
        System.out.println(c.getCadence());
        System.out.println(c.getGear());

        c.applyBreak(50);
        System.out.println(c.getSpeed());
        c.speedUp(20);
        System.out.println(c.getSpeed());
        System.out.println(c.getJaguar());
    }



}
