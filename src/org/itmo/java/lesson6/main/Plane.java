package org.itmo.java.lesson6.main;

public class Plane extends Transport {
    public Plane(Integer weight, Integer seatPlace, Boolean isFlying) {
        super(weight, seatPlace, isFlying);
    }

    @Override
    void abstractMethod() {
        System.out.println("abstract Method");
    }

    @Override
    public String transportName() {
        return null;
    }
}
