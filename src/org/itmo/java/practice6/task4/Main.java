package org.itmo.java.practice6.task4;

public class Main {
    public static void main(String[] args) {
        MainClass mClass = new MainClass();
        mClass.setNumber();
        System.out.println("mClass has " + mClass.getNumber());

        HeirClass hClass = new HeirClass();
        hClass.setNumber();
        System.out.println("Main class has " + hClass.getNumber());

        hClass.showNumOfMainClass();

    }
}
