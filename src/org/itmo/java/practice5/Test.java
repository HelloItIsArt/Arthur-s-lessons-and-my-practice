package org.itmo.java.practice5;

public class Test {
    public static void main(String[] args) {
        int[][] arr = {
                {1234, 2522, 34, 345},
                {12, 54, 684, 984}
        };

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr.length; ++j) {
                System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }


        /*
        int min, max;
        min = max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
         */
    }
}
