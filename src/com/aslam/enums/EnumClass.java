package com.aslam.enums;

public class EnumClass {

    private EnumDemo days;
    private Planet planet;

    public EnumClass() {}

    public EnumClass(EnumDemo days) {
        this.days = days;
    }

    public void tellItLikeItIs() {
        switch (days) {
            case MONDAY:
                System.out.println("Monday");
                break;
            case FRIDAY:
                System.out.println("Friday");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("default");
                break;
        }
    }

    public void enums() {
        for (EnumDemo days: EnumDemo.values()) {
            if (days.equals(EnumDemo.MONDAY))
                System.out.println(days);
        }
    }

    public void planet() {
        System.out.println("Earth mass: " + Planet.EARTH.mass());
        System.out.println("Earth radius: " + Planet.EARTH.radius());
    }

    public static void main(String[] args) {
        EnumClass firstDay = new EnumClass(EnumDemo.MONDAY);
        firstDay.tellItLikeItIs();

        EnumClass thirdDay = new EnumClass(EnumDemo.WEDNESDAY);
        thirdDay.tellItLikeItIs();

        firstDay.enums();
        firstDay.planet();

    }

}
