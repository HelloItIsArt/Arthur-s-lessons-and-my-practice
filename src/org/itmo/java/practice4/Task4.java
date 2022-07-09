package org.itmo.java.practice4;

import java.util.Scanner;

// Программа принимает от пользователя три целых числа и возвращает true если
// второе число больше первого числа, а третье число больше второго числа.
public class Task4 {
    public boolean check() {
        boolean answer;
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число ");
        int num2 = in.nextInt();

        System.out.print("Введите третье число ");
        int num3 = in.nextInt();

        System.out.print("Результат: ");
        answer = num2 > num1 & num3 > num2;

        return answer;
    }
    public static void main(String[] args) {
        Task4 test = new Task4();
        System.out.println(test.check());
    }
}
