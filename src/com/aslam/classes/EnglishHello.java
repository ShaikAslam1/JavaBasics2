package com.aslam.classes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class EnglishHello implements HelloWorld {

    public void greet() {
        System.out.println("Hi");
    }

    @Override
    public void greetSomeone(String someone) {
        System.out.println("Hi " + someone);
    }

    HelloWorld h = new HelloWorld() {
        @Override
        public void greetSomeone(String name) {
            System.out.println("Hi --" + name);
        }
    };

    HelloWorld h1 = someone -> System.out.println("Hi " + someone);

    // Lambda expression
    HelloWorld h2 = name -> {
        int a = 2;
        System.out.println("Hi --" + name);
        System.out.println("Hi --" + name);
        ++a;
        System.out.println(a);
    };

//    MyInterface ref;
    MyInterface ref = new MyInterface() {
        @Override
        public double getPiValue() {
            return 3.145;
        }
    };

    MyInterface myInterface = () -> 3.145;
    double d = myInterface.getPiValue();

    // Array or List
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

//    int[] numbers = {1, 2, 3, 4, 5};

    void doIt() {
        for(int i =0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
        }

        for(int num: numbers) {
            System.out.print(num);
        }

        numbers.forEach(i -> System.out.print(i));
        // Method reference
        numbers.forEach(System.out::print);

        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer);
            }
        });

        List<String> names = Arrays.asList("Sajid", "Salman");
        names.forEach(System.out::print);
    }

}
