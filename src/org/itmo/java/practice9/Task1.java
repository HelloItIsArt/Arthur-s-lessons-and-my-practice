package org.itmo.java.practice9;

import java.util.*;

public class Task1 {

    // конструктор принимающий list
    public Task1() {
    }

    // метод по очистке list от дубликатов
    public List<Object> dubsCleaner(List<Object> list) {
        // очистка от дубликатов
        Set<Object> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {

        // создал пустой list. спросить про <Object>, без него list не обработан
        List<Object> list = new ArrayList<>();

        // создал объект который будет выполнять задание 1
        Task1 listLoader = new Task1();

        // имитация заполнения с дубликатами
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                list.add(i);
            }
        }

        // имитация заполнения с дубликатами другого типа
        for (int i = 0; i < 2; i++) {
            for (double j = 0; j <= 2; j++) {
                list.add("word " + j);
            }
        }

        // для проверки заполнения
        System.out.println(list);

        // проверка очистки
        System.out.println(listLoader.dubsCleaner(list));
    }
}
