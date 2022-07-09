package org.itmo.java.practice6.task3;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck(5320, "KAMAZ", 'ж', 90f, 8, 7080);
        truck.outPut();
        truck.newWheels(7);
    }
}
