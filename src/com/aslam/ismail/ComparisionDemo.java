package com.aslam.ismail;

public class ComparisionDemo {
    public static void main(String[] args) {
          int value1 = 5;
          int value2 = 2;
        System.out.println("value1" == "value2");
        System.out.println("value1" != "value2");
        System.out.println(value1 > value2);
        System.out.println(value1 >= value2);
        System.out.println(value1 < value2);
        System.out.println(value1 >=value2);
        //ConditionalDemo1//
        int a =10;
        int b =20;
        if ((a==10) && (b==20))
            System.out.println("a is 10 ");

        System.out.println((a==10) && (b==20));
        if ((a==10) || (b==20))
            System.out.println("b is 20");
        if ((a==10) || (b==21))
            System.out.println("a is 10 || b is 21");

        System.out.println((a==10 || b==20));
        System.out.println((a==10 || b==21));
        //ConditionalDemo2//
        int c = 50;
        int d = 500;
         int e;
        boolean x = false;
        e = x ? c:d;
        System.out.println(e);






    }






}
