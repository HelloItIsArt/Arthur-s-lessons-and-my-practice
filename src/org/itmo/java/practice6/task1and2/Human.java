package org.itmo.java.practice6.task1and2;

public abstract class Human implements Info {   // класс не реализует интерфейс, т.к. метод абстрактный
    private String name;
    private String surname;

    // конструктор по умолчанию
    public Human() {
        this.name = "no name";
        this.surname = "no surname";
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    // метод для получения имени
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    // метод для получения фамилии
    public void setSurname(String surname) {
        this.surname = surname;
    }
}
