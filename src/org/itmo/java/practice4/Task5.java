package org.itmo.java.practice4;

import java.util.Scanner;

// Программа проверяет первый и последний элемент массива на число 3
public class Task5 {
    private final int[] arr = new int[2];
    public void arr() {
        Scanner scanner = new Scanner(System.in);

        // ввод элементов
        for (int i = 0; i < 2; i++) {
            System.out.print("Введите элемент ");
            arr[i] = scanner.nextInt();
        }

        // проверка первого и последнего элемента на число 3
        System.out.println("array = " + arr[0] + ", " + arr[1]);
        System.out.println(arr[0] == 3 || arr[1] == 3);
    }

    public static void main(String[] args) {
        Task5 check = new Task5();
        check.arr();
    }
}
