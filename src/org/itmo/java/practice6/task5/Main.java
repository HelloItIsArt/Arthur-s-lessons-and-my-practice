package org.itmo.java.practice6.task5;

public class Main {
    public static void main(String[] args) {
        MainClass mClass = new MainClass();
        mClass.setUserInfo();
        System.out.println(mClass.getUserAge());

        HeirClass hClass = new HeirClass();
        hClass.setUserInfo();

        System.out.println(hClass.getUserName());
    }
}
