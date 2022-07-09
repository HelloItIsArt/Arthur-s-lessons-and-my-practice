package org.itmo.java.practice5;

public class Task5 {

    /*5.	Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
    Sample Output:
    The given string is: This is a test string
    The string reversed word by word is:
    sihT si a tset gnirts
    */
    public void somMeth () {
        System.out.println("it's working");
    }
    public static String inverter(String text) {
        String result = null;

        if (text == null) {
            return result;
        }

        // проверка на пустоту текста
        if (text.equals("")) {
            System.out.println("The text is empty");
            return result;
        }

        String[] words = text.split(" ");
        String[] buffer = new String[words.length];

        // реверсировали каждое слово
        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            String reversedString = sb.reverse().toString();
            buffer[i] = reversedString;
        }

        StringBuilder sb = new StringBuilder();
        // вывели в консоль без пробела после заключительного слова
        for (String word : buffer) {
            if (word.equals(buffer[buffer.length - 1])) { // чтобы  не выводил пробел в конце предложения
                result = sb.append(word).toString();
                break;
            }
            result = sb.append(word).append(" ").toString();
        }
        return result;
    }

    public static void main(String[] args) {
//        String text = null;
        String text = "";
//        String text = "Напишите метод который инвертирует слова в строке Предполагается что в строке нет знаков препинания и слова разделены пробелами";
        System.out.println(text);
        System.out.println(inverter(text));
    }
}
