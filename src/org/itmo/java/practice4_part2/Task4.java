package org.itmo.java.practice4_part2;

// Программа ищет заданное уникальное число
public class Task4 {
    public void numSearch(int[] arr, int uniqueNumber) {
        int requiredNum = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == uniqueNumber) {
                index = i;
                requiredNum = arr[i];
                break;
            }
        }
        if (requiredNum == uniqueNumber) {
            System.out.println("The first unique number " + uniqueNumber +
                    " has an " + "index of " + index);
        } else System.out.println("There is no unique number");
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 5, 48, 4, 6, 3}; // два числа 3 для проверки ПЕРВОГО
        int uniqueNum = 3;
        Task4 test = new Task4();
        test.numSearch(array, uniqueNum);
    }
}
