package org.itmo.java.practice6.task4;

public class HeirClass extends MainClass {
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    public void setNumber() {
        this.number = sc.nextInt();
    }

    public void showNumOfMainClass() {
        System.out.println("A number of MainClass is " + super.getNumber());  // возвращает из дочернего??
    }
}
