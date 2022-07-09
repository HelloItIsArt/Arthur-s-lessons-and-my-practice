package org.itmo.java.practice4_part2;

import java.util.Scanner;

// Программа проверки сортировки массива по возрастанию
public class Task1 {
    private final int[] arr = new int[5];

    public void arrCount() {
        String ok = "OK";
        String again = "Please, try again";
        boolean check = false;
        Scanner scanner = new Scanner(System.in);

        // ввод элементов массива
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите элемент ");
            arr[i] = scanner.nextInt();
        }

        // проверка на сортировку по возрастанию
        for (int i = 0; i < 4; i++) {
            int j = i + 1;
            if (arr[i] < arr[i + 1] & arr[j] > arr[i]) {
                check = true;
            } else check = false;
        }

        // вывод результата
        if (check) System.out.println(ok);
        else System.out.println(again);
    }

    public static void main(String[] args) {
        Task1 test = new Task1();
        test.arrCount();
    }
}
