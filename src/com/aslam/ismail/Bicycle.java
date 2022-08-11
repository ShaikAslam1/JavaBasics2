package com.aslam.ismail;

public class Bicycle {

    private int cadence;
    private int gear;
    private int speed;

    public static int commonVariable;

    public static final double PI = 3.141592653589793;

    private Bike2 bike;

    public Bicycle(int cadence2, int gear2, int speed2, int commonVariable, Bike2 bike) {

//        this.cadence = cadence2;
//        this.gear = gear2;

        this(cadence2, gear2, commonVariable);

        this.speed = speed2;
        this.bike = bike;

    }

    public Bicycle(int cadence, int gear, int commonVariable) {
        this.cadence = cadence;
        this.gear = gear;
        this.commonVariable = commonVariable;
    }

    public Bicycle() {
        this(1,1,1,3,  new Bike2());
    }

    public void setBike(Bike2 bike) {
        this.bike = bike;
    }

    public Bike2 getBike() {
        return bike;
    }

    public int getCadence() {
        return cadence;
    }

    public void setCadence(int cadence) {
        this.cadence = cadence;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setCommonVariable(int commonVariable) {
        this.commonVariable = commonVariable;
    }

    public int getCommonVariable() {
        return commonVariable;
    }

    public void setValues(int... arrs) {
        gear = arrs[0];
        speed = arrs[1];
        cadence = arrs[2];
    }

    public Bicycle createBicycle(Bicycle bicycle) {
        Bicycle b = new Bicycle();
        b.setGear(bicycle.getGear());
        b.setSpeed(bicycle.getSpeed());
//        cadence = bicycle.getCadence();

        return b;
    }

    // class methods
    public static String classMethod() {
//        System.out.println("inside class method");

        return "inside class method";
    }

    // static block
    static {
        System.out.println("under static block");
        // code
    }

    static {
        // code
    }

    // initializer blocks
    {
        gear = 3;
        cadence = 6;
        speed = 10;
    }

    // another class
    class MountainBike {
        int chain;
        int speed;

        public int getChain() {
            return chain;
        }

        public void setChain(int chain) {
            this.chain = chain;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }

    // static class
    static class StaticClass {
        private int a;
        private int b;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public int getB() {
            return b;
        }

        public void setB(int b) {
            this.b = b;
        }
    }

}
