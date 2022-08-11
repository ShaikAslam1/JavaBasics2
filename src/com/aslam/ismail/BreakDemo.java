package com.aslam.ismail;

public class BreakDemo {
    public static void main(String[] args) {
        int[] a= {32,87,3,589,12,1076,2000,8,622,127};
        int b = 12;
        int i;
        boolean c = false;

        for (i=0;i<a.length;i++){
            if (a[i]==b){
                c = true;
                break;
            }
        }
        if (c) {
            System.out.println("found"+ b+"at index" + i);
        }else {
            System.out.println(b+ "not in the array");
        }
    }




}
