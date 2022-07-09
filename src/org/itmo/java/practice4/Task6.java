package org.itmo.java.practice4;

import java.util.Scanner;

// Программа проверяет массив на наличие числа 1 или 3
public class Task6 {
    private final int[] arr = new int[10];

    public void arr() {
        Scanner scanner = new Scanner(System.in);
        boolean check1 = false;
        boolean check2 = false;

        // ввод элементов массива
        for (int i = 0; i < 10; i++) {
            System.out.print("Введите элемент ");
            arr[i] = scanner.nextInt();
        }

        // проверка на содержание в массиве 1 или 3
        for (int i = 0; i < 10; i++) {
            if (arr[i] == 1) { // в один
                check1 = true;
                continue;
            }
            if (arr[i] == 3) {
                check2 = true;
                break;
            }
        }

        System.out.println("Array has 1 is " + check1);
        System.out.println("Array has 3 is " + check2);
    }

    public static void main(String[] args) {
        Task6 check = new Task6();
        check.arr();
    }
}
