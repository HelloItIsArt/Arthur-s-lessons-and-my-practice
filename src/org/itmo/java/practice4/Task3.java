package org.itmo.java.practice4;

import java.util.Scanner;
// Программа вычисляет сумму 2 целых чисел и возвращает true если сумма = третьему
public class Task3 {
    public boolean check() {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число ");
        int num2 = in.nextInt();

        System.out.print("Введите третье число ");
        int num3 = in.nextInt();

        System.out.print("Результат: ");

        return num1 + num2 == num3;
    }

    public static void main(String[] args) {
        Task3 test = new Task3();
        System.out.println(test.check());
    }
}
