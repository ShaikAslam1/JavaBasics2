package com.aslam;


import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
       // AnonymousDemo an = new AnonymousDemo();//
      //  an.createClass();//
       // Dog d1 = new Dog();
        d1.displayInfo();//
        @SuppressWarnings("unchecked")
        static void wordsList() {
            ArrayList wordList = new ArrayList<>();

// This causes an unchecked warning
            wordList.add("programiz");

            System.out.println("Word list => " + wordList);
        }

        public static void main(String args[]) {
            wordsList();
        }
    }

    }
}

