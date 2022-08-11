package com.aslam.ismail;

public class BreakwithLableDemo {
    public static void main(String[] args) {
        int[][] a = {
                {100,200,300,400},
                {500,600,700,800},
                {900,1000,1100,1200},
                {1300,1400,1500,1600}
        };
        int b = 50;

        int i;
        int j = 0;
        boolean c = false;

        search:
        for (i=0;i<a.length;i++){
            for (j=0;j<a[i].length;j++){
                if (a[i][j]== b){
                    c= true;
                    break search;

                }
            }
        }
if (c) {
    System.out.println("found " + b+ " at "+i+","+j);
}else {
    System.out.println(b + "Array me nahi");
}


    }
}
