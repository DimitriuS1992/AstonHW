package org.example;

public class task13 {
    public static void fillDiagonal(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
    }
}
