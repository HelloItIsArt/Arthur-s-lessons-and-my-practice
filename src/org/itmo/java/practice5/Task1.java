package org.itmo.java.practice5;

import java.util.Arrays;

// Написать метод для поиска самого длинного слова в тексте
public class Task1 {
    public static void searchLongestString(String text) {
        // проверка на пустоту текста
        if (text.equals("")) {
            System.out.println("The text is empty");
            return;
        }

        // режем пунктуацию
        text = text.replaceAll("\\p{Punct}", "");

        // массив для слов
        String[] words = text.split(" ");
        Integer[] lengthsOfWords = new Integer[words.length];
        int index = 0;

        // заполняем массив числами равными длине каждого слова
        for (String s : words) {
            int lettersInWord = s.length();
            lengthsOfWords[index] = lettersInWord;
            index++;
        }

        Arrays.sort(lengthsOfWords); // сортируем для выяснения наибольшего числа
        System.out.println(Arrays.toString(lengthsOfWords)); // для проверки как работает

        // сравниваем длину каждого слова с наибольшим значением
        for (String word : words) {
            if (word.length() == lengthsOfWords[lengthsOfWords.length - 1]) {
                System.out.println("The longest word is " + word);
            }
        }
    }

    public static void main(String[] args) {
        String text = "Написать метод для поиска самого длинного слова в тексте.";
        searchLongestString(text);
    }
}
