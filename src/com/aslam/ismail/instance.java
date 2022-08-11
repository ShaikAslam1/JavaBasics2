package com.aslam.ismail;

public class instance {
    private int a = 5; // instance//
    static  int s =0;// class//

    int s1 = 3; // literals

    public static void main(String[] args) {
        System.out.println(s);
      int r = 10;//local variables//
        long t1 = 347584L;
        int t2 = 347584;
        System.out.println(r);

        instance instance = new instance();//object for instance//

        System.out.println(instance.printa());

        float pi = 3.4544948615631598462035198491563206489489f;
        System.out.println(pi);

        double pi2 = 3.4544948615631598462035198491563206489489f;
        System.out.println(pi2);

        char name = 'c';




    }
       public int printa(){

        return a;
       }

}
