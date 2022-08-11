package com.aslam.ismail;

public class StringSwitchDemo {
    public static int getmonthNumber(String month){
        int monthNumber = 0;
        if (month == null) {
            return monthNumber;
        }
switch (month.toLowerCase()){
    case "january":
        monthNumber = 1;
        break;
    case "february":
        monthNumber = 2;
        break;
    case "mar":
        monthNumber = 3;
        break;
    case "apr":
        monthNumber = 4;
        break;
    case "may":
        monthNumber = 5;
        break;
    case "jun":
        monthNumber = 6;
        break;
    case "jul":
        monthNumber = 7;
        break;
    case "aug":
        monthNumber = 8;
        break;
    case "sep":
        monthNumber = 9;
    case "oct":
        monthNumber = 10;
        break;
    case "nov":
        monthNumber = 11;
        break;
    case "dec":
        monthNumber = 12;
        break;
    default:
        monthNumber = 0;
        break;


}
        return monthNumber;
    }

    public static void main(String[] args) {
        String month = null;
        int returnedMonthNumber = StringSwitchDemo.getmonthNumber(month);
       if (returnedMonthNumber==0){
           System.out.println("invalid month");
    } else {
           System.out.println(returnedMonthNumber);
       }
    }
    }







