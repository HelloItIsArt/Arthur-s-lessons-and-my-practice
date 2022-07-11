package org.itmo.java.practice9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task2 {
    ArrayList<Object> buffList = new ArrayList<>();
    LinkedList<Object> buffLinkList = new LinkedList<>();
    Random randomizer = new Random();
    int listElement = 0; // пусть элементом будет число типа int

    // конструктор, либо пустой, либо для array или linked листа
    public Task2() {

    }

    // методы заполняющий листы элементами
    public void listLoader(ArrayList<Object> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }
    public void listLoader(LinkedList<Object> list) {
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
    }

    // методы выбирают элемент из списка наугад и добавляют его в буферный лист
    // в задании сказано "выбирает", поэтому причина выбора будет - добавление в другой лист
    public ArrayList<Object> randomCatcher(ArrayList<Object> list) {
        for (int i = 0; i < 100000; i++) {
            listElement = randomizer.nextInt(list.size()); // наугад выбираю число в диапазоне от 0 до 1млн
            buffList.add(i, (list.get(listElement))); // заполняю буферный list
        }
        list = buffList;
        return list;
    }
    public LinkedList<Object> randomCatcher(LinkedList<Object> list) {
        for (int i = 0; i < 100000; i++) {
            listElement = randomizer.nextInt(list.size());
            buffLinkList.add(i, (list.get(listElement))); // заполняю буферный linkList
        }
        list = buffLinkList;
        return list;
    }


    public static void main(String[] args) {
        double startTime = System.currentTimeMillis();
        ArrayList<Object> list = new ArrayList<>();
        LinkedList<Object> list1 = new LinkedList<>();

        Task2 test = new Task2();

        // запуск по отдельности чтобы оценить время
//        test.listLoader(list);
        test.listLoader(list1); // примерно 252 секунды 0_0  !!

//        list = test.randomCatcher(list); // примерно 0,2 секунды
        list1 = test.randomCatcher(list1);

        double time = System.currentTimeMillis() - startTime;
        time /= 1000;
        System.out.println(time + "sec");
    }
}
