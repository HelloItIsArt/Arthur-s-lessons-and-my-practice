package org.itmo.java.practice6.task5;

import java.util.Scanner;

public class MainClass {
    Scanner sc = new Scanner(System.in);
    private int userAge;

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public void setUserInfo() {
        this.userAge = sc.nextInt();
    }
}
