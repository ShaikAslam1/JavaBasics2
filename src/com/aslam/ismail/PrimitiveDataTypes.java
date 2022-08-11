package com.aslam.ismail;

import jdk.internal.dynalink.beans.StaticClass;

public class PrimitiveDataTypes {
   public float  a = 0.222222226f;//instance//
     static double b = 0.1225252522222222222220011; //static//

    public static void main(String[] args) {
        boolean f = true;
        System.out.println(f);
        char h = 'k';
        System.out.println(h);
        byte c = 101;//local variables//
        System.out.println(c);
        System.out.println(b);

        PrimitiveDataTypes PrimitiveDataTypes = new PrimitiveDataTypes();
        System.out.println(PrimitiveDataTypes.printa());




    }
     public float printa() {return a;}



}
