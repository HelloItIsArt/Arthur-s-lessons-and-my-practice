package org.itmo.java.practice7;

public class Plane {
    private String name;
    private Wing wing;

    public Plane(String name, int wingWeight) {
        this.name = name;
        wing = new Wing();
        wing.setWingWeight(wingWeight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wing getWing() {
        return wing;
    }

    // подкласс крыло
    class Wing {
        //поле инф веса крыла
        private int wingWeight;

        public int getWingWeight() {
            return wingWeight;
        }

        public void setWingWeight(int wingWeight) {
            this.wingWeight = wingWeight;
        }

        // метод, показывающий вес крыла
        public void wingInf () {
            System.out.println("Wing weight is " + getWingWeight());
        }
    }
}
