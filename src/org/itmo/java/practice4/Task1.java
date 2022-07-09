package org.itmo.java.practice4;

// Программа вывода на консоль нечетных чисел от 1 до 99
public class Task1 {
    public void checking() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Task1 test = new Task1();
        test.checking();
    }
}
