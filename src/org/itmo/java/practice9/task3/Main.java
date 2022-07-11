package org.itmo.java.practice9.task3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MapOfUsersPoints map = new MapOfUsersPoints();

        // пусть в игре будет два игрока
        User player1 = new User();
        User player2 = new User();

        // задаем имена
        player1.setName();
        player2.setName();

        // проверка отработки метода nameSetter() выше
        map.showMap();

        // здесь код какой то игры с начислением очков
        //
        //
        // заменим начисление очков методом генерации очков
        Random randomizer = new Random();
        Integer point1 = randomizer.nextInt(10);
        Integer point2 = randomizer.nextInt(10);

        // получаем имена игроков
        String fstName = player1.getName();
        String sndName = player2.getName();

        // присваиваем сгенерированные очки
        map.getPoint(fstName, point1);
        map.getPoint(sndName, point2);

        // проверка мапы
        map.showMap();

        // метод показывает очки по введенному имени
        map.showPointsByName();
    }
}
