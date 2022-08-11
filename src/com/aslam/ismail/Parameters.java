package com.aslam.ismail;

public class Parameters {

    int currentGear = 1;

    public static void main(String[] hug) {
        Parameters parameters = new Parameters();
        System.out.println(parameters.changeGear());

    }

    int changeGear() {
        if(currentGear < 2) {
            ++currentGear;
        }
        return currentGear;
    }

}
