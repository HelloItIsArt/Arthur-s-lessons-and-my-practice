package org.itmo.java.lesson6.main;

public class Bus implements Moveable, Interface {
    @Override
    public void printTransportInfo() {
        System.out.println(transportName());
    }

    @Override
    public String transportName() {
        return "Scania";
    }
}
