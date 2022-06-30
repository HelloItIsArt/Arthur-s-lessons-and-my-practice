package org.itmo.java.lesson6;

import org.itmo.java.lesson2.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

//        Field[] declaredFields = car.getClass().getDeclaredFields();
//        for (Field declaredField : declaredFields) {
////            System.out.println(declaredField);
//        }

        Object object = new Object();

        Parent parent = new Parent();
        Parent parent2 = new Child();
        Parent parent3 = new AnotherChild();

        Child child = new Child();
        child.someMethod();


//        Child child = new Parent();  // создание невозможно
//        parent.print();
//        parent2.print();
//        parent3.print();


//        ((Child)parent).print();    <- ClassCastException

        System.out.println(parent(parent));
        System.out.println(parent(parent2));
        System.out.println(parent(parent3));
        System.out.println(parent(child));

    }

    public static Parent parent (Parent parent) {
        parent.print();
        return parent;
    }
}
