package org.itmo.java.practice4_part2;

import java.util.Arrays;

public class Task5 {
    public static int[] mergesort(int[] array1) {
        int[] buffer1 = Arrays.copyOf(array1, array1.length);
        int[] buffer2 = new int[array1.length];
        int[] result = mergesortInner(buffer1, buffer2, 0, array1.length);
        return result;
    }

    public static int[] mergesortInner(int[] buffer1, int[] buffer2,
                                       int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {  // endIndex = 5 (т.к. = длине массива), но по логике названия должен быть = 4, поэтому (endIndex - 1)
            return buffer1;
        }

        // сортировка после разбиения на два примерно равных.
        int middle = startIndex + (endIndex - startIndex) / 2; // находим индекс посередине
        int[] sorted1 = mergesortInner(buffer1, buffer2, startIndex, middle); // сортированный массив 1 имеет начало от startIndex до middle
        int[] sorted2 = mergesortInner(buffer1, buffer2, middle, endIndex); // сортированный массив 2 имеет начало от middle до startIndex

        // Слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = (sorted1 == buffer1) ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = (sorted1[index1] < sorted2[index2])
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void main(String[] args) {

        int[] array1 = new int[2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ((int)(Math.random() * 11));
        }
        System.out.println("Before sort " + Arrays.toString(array1));
        int[] result = mergesort(array1);
        System.out.println("After sort " + Arrays.toString(result));
    }
}
