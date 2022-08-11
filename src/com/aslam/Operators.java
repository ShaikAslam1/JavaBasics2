package com.aslam;

public class Operators {

    public static void main (String[] args) {

        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        int original_result = result;

        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        original_result = result;

        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        original_result = result;

        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        original_result = result;

        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        original_result = result;

        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);

        // Unary operators
        int a = 2;
        System.out.println(a);
        a+=1; // a+=1; a = a+1;
        System.out.println(a);
        a++;
        System.out.println(a);
        a--;
        System.out.println(a);

        boolean bool = false;
        System.out.println("Boolean");
        System.out.println(bool);
        bool = !bool;
        System.out.println(bool);



        String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);

        // 2 + 5 - 7

        int result2 = +1;
        // result is now 1
        System.out.println(result2);

        result2--;
        // result is now 0
        System.out.println(result2);

        result2++;
        // result is now 1
        System.out.println(result2);

        result2 = -result2;
        // result is now -1
        System.out.println(result2);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);

        // ==================
        int i = 3;
        i++;
        // prints 4
        System.out.println(i);
        ++i;
        // prints 5
        System.out.println(i);
        // prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);
        // prints 7
        System.out.println(i);
    }
}
