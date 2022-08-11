package com.aslam.classes;

import com.aslam.enums.EnumClass;

public class AnonymousClass {

    interface HelloWorld {
        void greet();
        void greetSomeone(String someone);
    }

    HelloWorld h = new HelloWorld() {

        @Override
        public void greet() {
            System.out.println("dummy");
        }

        @Override
        public void greetSomeone(String someone) {
            System.out.println("" + someone);
        }

        void test() {

        }
    };

    EnglishHello englishHello = new EnglishHello() {
        void sayHello() {

        }
    };

    public void sayHello() {
        HelloWorld englishGreeting = new HelloWorld() {

            public void greet() {
                System.out.println("Hello!!");
            }

            public void greetSomeone(String someone) {
                System.out.println("HI " + someone);
            }
        };

        englishGreeting.greet();
        englishGreeting.greetSomeone("Ismail");

        HelloWorld arabicGreeting = new HelloWorld(){
            @Override
            public void greet() {
                System.out.println("Marhaba!");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Marhaba " + someone);
            }
        };

        arabicGreeting.greet();
        arabicGreeting.greetSomeone("Aslam");
    }

    public static void main(String[] args) {
        AnonymousClass anonymousClass = new AnonymousClass();
        anonymousClass.sayHello();

        int a = 23;
        EnglishHello englishHello = new EnglishHello();
        englishHello.doIt2();
        com.aslam.classes.HelloWorld.staticMethod();

        englishHello.greet();
        englishHello.greetSomeone("Aslam");

        englishHello.h.greetSomeone("123");
        englishHello.h1.greetSomeone("321");
        englishHello.h2.greetSomeone("231");
        System.out.println(englishHello.myInterface.getPiValue());

        englishHello.doIt();

    }

}
