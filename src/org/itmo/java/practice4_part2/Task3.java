package org.itmo.java.practice4_part2;

import java.util.Arrays;

// Программа меняет местами первый и последний элементы массива
public class Task3 {
    private final int[] arr;

    public Task3(int[] arr) {
        this.arr = arr;
    }

    public void change() {
        System.out.println("Array 1: " + Arrays.toString(this.arr));
        int firstElement = this.arr[0];
        int lastElement = this.arr[arr.length - 1];
        this.arr[arr.length - 1] = firstElement;
        this.arr[0] = lastElement;
        System.out.println("Array 2: " + Arrays.toString(this.arr));
    }

    public static void main(String[] args) {
        int[] array = {5, 6, 7, 2};
        Task3 test = new Task3(array);
        test.change();
    }
}
