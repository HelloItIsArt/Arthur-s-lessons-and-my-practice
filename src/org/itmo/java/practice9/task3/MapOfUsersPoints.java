package org.itmo.java.practice9.task3;

import java.util.*;

public class MapOfUsersPoints {
    static Map<String, Integer> map = new HashMap<>();

    // метод принимает от класса user имя и помещает в map
    public static void nameSet(String playerName) {
        map.put(playerName, 0);
    }

    // метод показывает содержимое map
    public void showMap() {
        System.out.println(map);
    }

    // метод принимает сгенерированные в main очки
    public void getPoint(String name, Integer point) {
        map.put(name, point);
    }

    // метод показывающий по имени игрока его очки
    public void showPointsByName() {
        Scanner scanner = new Scanner(System.in);

        // цикл будет работать пока не введут существующее имя
        for (int i = 0; i < 1; i++) {
            check: {
                System.out.println("enter the existing player's name");
                String checkedName = scanner.nextLine();

                // проверка на отсутствие имени
                if (!map.containsKey(checkedName)) {
                    System.out.println("the player not exists");
                    i--;
                    break check;
                }

                System.out.print("the player has ");
                Integer points = map.get(checkedName);
                System.out.print(points);
                System.out.print(" points");
            }
        }
    }
}
