package org.itmo.java.lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainItmoJava {
    public static void main(String[] args) throws IOException {
//        System.out.println("Hello world!");
        byte b = 100;
        short s = 123;
        int i = 500;
        long l = 5000000000L;
        float f = 12.3f;
        double d = 14.5d;

        char c = 'a';
        boolean isTrue = true;

        byte r = (byte) (b + i);

//        System.out.println(r);

        long q = b + i;

        double i1 = (double) i / 3;
//        System.out.println(i1);

        String string = "Java";
        String str = new String("Java");
//        System.out.println(string);


        if (true) {
            //logic
        }


        if (true) {
            //logic
        } else {
            //logic
        }


        if (true) {
            //logic
        } else if (false) {
            //logic
        } else if (false) {
            //logic
        } else if (false) {
            //logic
        } else {

        }


        int x = 10;
        int y = 20;


        // x == y; x != y; x > y; x < y;  x >= y; x <= y; x % 2 == 0


        if (x == y && x > y) {
            //logic
        }


        if (((x < y && x == y)) || x > y) {
            //logic
        }


        int a = 0;

        String sss = a == 2 ? "Hello" : a == 3 ? "world!" : " wrong number";

        System.out.println(sss);


        Scanner scanner = new Scanner(System.in);
//        String s1 = scanner.nextLine();
//        int i2 = scanner.nextInt();
//
//        System.out.println(s1);
//        System.out.println(i2);


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s2 = reader.readLine();

        int i3 = Integer.parseInt(s2);

        System.out.println(i3);

        System.out.println("Itmo branch");



    }


    public static String switcher(Integer number) {

        switch (number) {
            case 10 :
                return "ten";
            case  20 :
                return "twenty";
            default:
                return "Illegal number";
        }
    }
}
