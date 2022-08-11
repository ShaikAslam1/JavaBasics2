package com.aslam.classes;

public interface HelloWorld {

    Double PI = 3.21;

    void greetSomeone(String someone);

    default void doIt2() {
        System.out.println("Inside default method");
    }

    static void staticMethod() {
        System.out.println("Inside static method");
    }
}
