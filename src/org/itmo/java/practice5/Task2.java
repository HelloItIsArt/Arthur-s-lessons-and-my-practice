package org.itmo.java.practice5;

import java.util.Scanner;

// метод, для проверки СЛОВА палиндрома (вопрос про понимание задачи)
public class Task2 {
    public static void palindromeCheck(String text) {
        // проверка на null
        if (text == null) {
            System.out.println("The text is null");
            return;
        }

        Scanner scanner = new Scanner(text);
        String[] arr = text.split(" ");

        // проверка на пустоту
        if (text.equals("")) {
            System.out.println("The text is empty");
            return;
        }

        // проверка на ввод числа (по заданию нужно слово)
        if (scanner.hasNextInt()) {
            System.out.println("You've entered a number");
            System.out.println("Please, enter a word");
            return;
        }

        // проверка на ввод предложения а не одного слова
        if (arr.length > 1) {
            System.out.println("Enter a word, not a sentence");
            return;
        }

        // приводим к нижнему регистру попутно с созданием билдера
        StringBuilder sb = new StringBuilder(arr[0].toLowerCase());

        // переворачиваем принимаемое слово
        sb.reverse();
        String checkWord = sb.toString();

        // проверка
        if (checkWord.equals(arr[0].toLowerCase())) {
            System.out.println("The word is a palindrome");
        } else System.out.println("The word isn't a palindrome");
    }

    public static void main(String[] args) {
        String word = "rfgad";
        palindromeCheck(word);
    }
}
