package com.aslam.ismail;

public class ifElseDemo {
    public static void main(String[] args) {
        int testscore =40;
        char grade;
        if (testscore>=90){
            grade = 'A';
        } else if (testscore>=80){
            grade = 'B';
        } else if (testscore>=70){
            grade = 'C';
        } else if (testscore>=60){
            grade = 'D';
        } else {
            grade = 'f';
        }
        System.out.println("his grade ="+ grade);


    }



}
