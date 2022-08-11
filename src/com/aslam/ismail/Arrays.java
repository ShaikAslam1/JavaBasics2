package com.aslam.ismail;

public class Arrays {
    public static void main(String[] args) {
        int[] anArray = new int[5];
        anArray[0] = 5;
        anArray[1] = 1;
        anArray[2] = 2;
        anArray[2] = 3;
        anArray[3] = 4;
        anArray[4] = 5;

        System.out.println(anArray[2]);


        int[][] multiArray = new int[3][5];
        multiArray[0][0] = 2;
        multiArray[1][1] = 3;
        multiArray[2][2] = 4;

        System.out.println(multiArray[0][0]);
        int[] anArray2 = {1, 2, 3, 6, 9, 76, 45};
        System.out.println("before anArray[6]");

        anArray2[6] = 5;

        int[][] multiArray2 = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2}
        };

        //string multi-dimensional array
        String[][] multiarray = {
                {"10", "ismail"},
                {"20", "srk"}
        };
        System.out.println(multiarray[1][0]);
    }
}
