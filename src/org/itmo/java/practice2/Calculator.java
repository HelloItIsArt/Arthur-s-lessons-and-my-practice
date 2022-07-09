package org.itmo.java.practice2;

public class Calculator {
    // addition
    public int addition(int x, int y) {
        return (x + y);
    }

    public double addition(double x, double y) {
        return (x + y);
    }

    public long addition(long x, long y) {
        return (x + y);
    }

    // division
    public double division(int x, int y) {
        double answer = 0;
        if (y == 0) {
            System.out.print("Division by zero isn't possible ");
        } else {
            answer = (double) x / y;
        }
        return answer;
    }

    public double division(double x, double y) {
        double answer = 0;
        if (y == 0) {
            System.out.print("Division by zero isn't possible ");
        } else {
            answer = x / y;
        }
        return answer;
    }

    public double division(long x, long y) {
        double answer = 0;
        if (y == 0) {
            System.out.print("Division by zero isn't possible ");
        } else {
            answer = (double) x / y;
        }
        return answer;
    }

    //multiplication
    public int multiplication(int x, int y) {
        return x * y;
    }

    public double multiplication(double x, double y) {
        return x * y;
    }

    public long multiplication(long x, long y) {
        return x * y;
    }

    //subtraction
    public int subtraction(int x, int y) {
        return x - y;
    }

    public double subtraction(double x, double y) {
        return x - y;
    }

    public long subtraction(long x, long y) {
        return x - y;
    }
}
