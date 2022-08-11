package com.aslam.ismail;

public class Variables2 {
      public int d = 5;//instance non static//
    public static void main(String[] args) {
      int a = 2;//local variables//
        System.out.println(a);

        Variables2 variables2 = new Variables2();//object creation for instance//
        System.out.println(variables2.printd());

    }

    public int printd(){
        return d;
    }
}
