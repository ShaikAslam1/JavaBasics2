package com.aslam.ismail;

public class switchDemo {
    public static void main(String[] args) {
        int month = 8;
        String monthString;
        switch (month) {
            case 1:
                monthString = "january";
                break;
            case 2:
                monthString = "feb";
                break;
            case 3:
                monthString = "mar";
                break;
            case 4:
                monthString = "apr";
                break;
            case 5:
                monthString = "may";
                break;
            case 6:
                monthString = "june";
                break;
            case 7:
                monthString = "july";
                break;
            case 8:
                monthString = "aug";
                break;
            case 9:
                monthString = "sep";
                break;
            case 10:
                monthString = "oct";
                break;
            case 11:
                monthString = "nov";
                break;
            case 12:
                monthString = "dec";
                break;
            default:
                monthString = "invalid month";
                break;
        }

        System.out.println(monthString);

        if (month == 1) {
            System.out.println("jan");
        } else if (month==2){
            System.out.println("feb");
        } else if (month==8){
            System.out.println("aug");
        }

    }








}
