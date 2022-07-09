package org.itmo.java.practice6.task4;

import java.util.Scanner;

public class MainClass {
    Scanner sc = new Scanner(System.in);
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = sc.nextInt();
    }
}
