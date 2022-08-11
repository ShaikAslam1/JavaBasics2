package com.aslam.ismail;

public class ConditionalDemo1 {

    public static void main(String[] args){
        int value1 = 1;
        int value2 = 2;
        if((value1 == 1) && (value2 == 2))
            System.out.println("value1 is 1 AND value2 is 2");
        if((value1 == 1) || (value2 == 1))
            System.out.println("value1 is 1 OR value2 is 1");

        // Ternary operator (?:)
        if (2>3)
            System.out.println("2 is greater than 3");
        else
            System.out.println("2 is not greater than 3");

        boolean ternaryOp = (2 > 3) ? true: false;
    }
}
