package org.itmo.java.practice4;

// Программа вывода на консоль числа от 1 до 100
// которые делятся на 3, на 5, на оба числа
public class Task2 { // while?
    public void divisionBy3And5() {

        System.out.print("Делится на 3:");
        for (int i = 0; i <= 100; i++) {
            if ((i % 3) == 0) {
                System.out.print(" " + i + " ");
            }
        }

        System.out.println();

        System.out.print("Делится на 5:");
        for (int i = 0; i <= 100; i++) {
            if ((i % 5) == 0) {
                System.out.print(" " + i + " ");
            }
        }

        System.out.println();

        System.out.print("Делится на 3 и 5:");
        for (int i = 0; i <= 100; i++) {
            if ((i % 5) == 0 & (i % 3) == 0) {
                System.out.print(" " + i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Task2 test = new Task2();
        test.divisionBy3And5();
    }
}
