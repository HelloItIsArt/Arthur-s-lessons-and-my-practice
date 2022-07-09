package org.itmo.java.practice5;

public class Task3 {

    // метод по замене неугодного слова на [вырезано цензурой]
    // сделал так хоть и прислали решение в телеграм
    public static void censor(String text, String censoredWord) {
        // проверка на пустоту текста
        if (text.equals("")) {
            System.out.println("The text is empty");
            return;
        }
        // замена неугодного слова
        text = text.replaceAll(censoredWord, "[вырезано цензурой]");
        System.out.println(text);
    }

    public static void main(String[] args) {
        String text = "Напишите бяка метод, бяка заменяющий бякав тексте все вхождения слова «бяка» на «[вырезано цензурой]».";
        System.out.println(text);
        censor(text, "бяка");
    }
}
