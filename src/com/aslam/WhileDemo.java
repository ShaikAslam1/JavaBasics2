package com.aslam;

public class WhileDemo {
    public static void main(String[] args){
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }

        System.out.println(" ======================== ");
        for(int i=1; i<11; i++){
            System.out.println("Count is: " + i);
            break;
        }
    }
}
