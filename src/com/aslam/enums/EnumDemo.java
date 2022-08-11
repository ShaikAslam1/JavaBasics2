package com.aslam.enums;

public enum EnumDemo {
    SUNDAY("Sunday"), MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;

    private String day;

    EnumDemo(String day) {
        this.day = day;
    }

    EnumDemo() {}
}
