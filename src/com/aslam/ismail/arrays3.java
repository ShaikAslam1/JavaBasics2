package com.aslam.ismail;

public class arrays3 {
    public static void main(String[] args) {
        boolean[] arrays = new boolean[4];
        arrays[0] = true;
        System.out.println(arrays[0]);

        int[][] multiArrays = new int[3][5];
        multiArrays[0][0] = 9;
        multiArrays[0][1] = 99;
        multiArrays[1][0] = 07;
        multiArrays[1][1] = 9999;
        System.out.println(multiArrays[0][0]);

        //string multidimensional array//
        String[][] multiarray = {
                {"ms", "dj"},
                {"dhoni", "bravo"}
        };
        System.out.println(multiarray[0][0] + multiArrays[1][0]);
        System.out.println(multiarray[0][1] + multiarray[1][1]);
        String[] nandyal = {"atr", "ndl", "knl", "vel"};
        String[] kurnool = new String[3];
        System.arraycopy(nandyal,0,kurnool,0,3);
        System.out.println(kurnool[1]);
        System.out.println(nandyal[3]);
    }
}
