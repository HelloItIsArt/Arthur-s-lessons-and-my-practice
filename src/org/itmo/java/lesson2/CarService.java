package org.itmo.java.lesson2;

public class CarService {
    public static long totalPrice(Car car,  Integer servicePrice) {
        if(servicePrice == null) {
//            System.err.println("servicePrice is null");
            return 0;
        } else {
            return car.getPrice() + servicePrice;
        }
    }

    public static  String  someMethod(String word) {
        String s = "12345";
        int x = 0;
        System.out.println(x);
        System.out.println(s);
        return word;
    }

    public static void main(String[] args) {
        System.out.println(someMethod("method"));
    }
}
