package com.aslam.ismail;
public class variables {
    public boolean a = false;//instance variables//

    public static void main(String[] args) {
        int age =0;//local variables//
System.out.println(age);
variables variables = new variables();
        System.out.println(variables.instance());

    }

    boolean instance(){
        return a;
    }
}
 class variablesA {
    public int a =20;//instance variables//

     public static void main(String[] args) {
         boolean b = true;//local variables//
         System.out.print(b);
         variablesA variables = new variablesA();
         System.out.println(variables.instance());
     }
int instance(){
         return a;
}

}

class variablesB {
    public boolean c = false;//instance variables//
    static int e = 40;//class variables//

    // variablesB.e= 40;
    public static void main(String[] args) {
        int d = 50;//local variables//
        System.out.println(d);
        variablesB variables = new variablesB();
        System.out.println(variables.instance());
        System.out.println(variablesB.e);

    }

    boolean instance() {
        return c;
    }
}