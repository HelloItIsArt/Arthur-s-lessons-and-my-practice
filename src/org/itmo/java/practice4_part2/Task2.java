package org.itmo.java.practice4_part2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public void arrCount() {
        // ввод с клавиатуры длины массива
        Scanner scanner = new Scanner(System.in);
        System.out.print("Array length: ");
        int arrLength = scanner.nextInt();
        int[] arr = new int[arrLength];

        // ввод элементов массива
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter a number for " + i + " index ");
            arr[i] = scanner.nextInt();
        }

        // вывод на консоль элементов
        System.out.print("Result: ");
        String arrLengthString = Arrays.toString(arr);
        System.out.println(arrLengthString);
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.arrCount();
    }
}
