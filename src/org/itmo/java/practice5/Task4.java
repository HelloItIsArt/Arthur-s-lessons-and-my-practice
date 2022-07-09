package org.itmo.java.practice5;

public class Task4 {

    /*4.	Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.*/

    public static void counter(String string, String requiredWord) {
        int match = 0;
        string = string.toLowerCase(); // приводим к нижнему регистру чтобы сработала проверка
        String[] text = string.split(" ");

        // проверка на совпадение
        for (String word : text) {
            if (word.equals(requiredWord)) {
                match++;
            }
        }

        // чисто для грамматически корректного вывода
        if (match == 0) {
            System.out.println("No matches");
        } else if (match == 1) {
            System.out.println(match + " match");
        } else if (match > 1) {
            System.out.println(match + " matches");
        }
    }

    public static void main(String[] args) {
        String text = "Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.";
        counter(text, "количество");
    }
}
