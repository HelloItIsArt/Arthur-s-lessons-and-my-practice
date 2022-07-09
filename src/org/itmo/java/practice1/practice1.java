package org.itmo.java.practice1;

import java.util.Scanner;

public class practice1 {
    public static void main(String[] args) {
        // первый пункт
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java" + "\n");
        // второй пункт
        double result1;
        double result2;
        result1 = (46 + 10) * (10 / 3d);
        result2 = (29) * (4) * (-15);
        System.out.println(result1 + "\t" + result2 + "\n");

        // трейтий пункт
        int number = 10500;
        double result3 = (number / 10d) / 10;
        System.out.println(result3 + "\n");

        // четвертый пункт
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        double result4 = a * b * c;
        System.out.println(result4 + "\n");

        // пятый пункт
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number1 = scanner.nextInt();
        System.out.println(number1);
        System.out.println("Введите число");
        int number2 = scanner.nextInt();
        System.out.println(number2);
        System.out.println("Введите число");
        int number3 = scanner.nextInt();
        System.out.println(number3);

        // шестой пункт
        b = scanner.nextInt();
        if (b % 2 == 0 && b > 100)
            System.out.println("Выход за пределы диапазона");
        else if (b % 2 != 0)
            System.out.println("нечетное");
        else
            System.out.println("четное");
    }
}
