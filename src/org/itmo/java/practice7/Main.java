package org.itmo.java.practice7;

public class Main {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Plane", 100);
        plane1.getWing().wingInf();

        Plane plane2 = new Plane("Plane2", 200);
        plane2.getWing().wingInf();
    }
}
