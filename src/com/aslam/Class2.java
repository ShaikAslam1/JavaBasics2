package com.aslam;

public class Class2 {
    protected InnerClass2 ic;

    public Class2() {
        ic = new InnerClass2();
    }

    public void displayStrings() {
        System.out.println(ic.getString() + ".");
        System.out.println(ic.getAnotherString() + ".");
    }

    static public void main(String[] args) {
        Class2 c2 = new Class2();
        c2.displayStrings();
    }

    protected class InnerClass2 {
        public String getString() {
            return "InnerClass2: getString invoked";
        }

        public String getAnotherString() {
            return "InnerClass2: getAnotherString invoked";
        }
    }
}

