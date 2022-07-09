package org.itmo.java.practice6.task3;

public class Truck extends Car {
    private int wheels;
    private int maxWeight;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    // конструктор, устанавливающий все значения в конструктор главного класса и все значения в класс Грузовик.
    public Truck(int w, String m, char c, float s, int wheels, int maxWeight) {
        super(w, m, c, s);
        this.wheels = wheels;
        this.maxWeight = maxWeight;
    }

    // метод, уст-щий значение в поле количество колес
    public void newWheels (int numOfWheels) {
        wheels = numOfWheels;
        System.out.println("У грузовика " + wheels + " колес.");
    }
}
