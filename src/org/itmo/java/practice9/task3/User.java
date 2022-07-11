package org.itmo.java.practice9.task3;
import java.util.Scanner;

public class User {
    private String name;

    public User() {
    }

    public String getName() {
        return name;
    }

    // сеттер задает имя объекту юзер и добавляет это имя в map c названием MapOfUsersPoints
    public void setName() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            check: {
                System.out.println("enter a unique player name");
                this.name = scanner.nextLine();

                // проверка на идентичность имен
                if (MapOfUsersPoints.map.containsKey(this.name)) {
                    System.out.println("the name already exists");
                    i--;
                    break check;
                }

                MapOfUsersPoints.nameSet(this.name);
            }
        }
    }
}
