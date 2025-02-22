package org.example;

import static org.example.task1.printThreeWords;
import static org.example.task10.invertArray;
import static org.example.task11.fillArray;
import static org.example.task12.multiplyLessThanSix;
import static org.example.task13.fillDiagonal;
import static org.example.task14.createArray;
import static org.example.task2.checkSumSign;
import static org.example.task3.printColor;
import static org.example.task4.compareNumbers;
import static org.example.task5.isSumInRange;
import static org.example.task6.checkNumberSign;
import static org.example.task7.isNegative;
import static org.example.task8.printStringMultipleTimes;
import static org.example.task9.leapYear;

public class Main {
    public static void main(String[] args) {
        System.out.println("Работа метода №1: printThreeWords");
        printThreeWords();

        System.out.println("\nРабота метода №2: checkSumSign");
        checkSumSign();

        System.out.println("\nРабота метода №3: printColor");
        printColor();

        System.out.println("\nРабота метода №4: compareNumbers");
        compareNumbers();

        System.out.println("\nРабота метода №5: isSumInRange");
        System.out.println(isSumInRange(3, 15));


        System.out.println("\nРабота метода №6: checkNumberSign");
        checkNumberSign(-6);


        System.out.println("\nРабота метода №7: isNegative");
        System.out.println("Отрицательное ли число? " + isNegative(-3));

        System.out.println("\nРабота метода №8: printStringMultipleTimes");
        printStringMultipleTimes("Hello, World!", 3);


        System.out.println("\nРабота метода №9: leapYear");
        System.out.println("2024 год високосный? " + leapYear(2024));


        System.out.println("\nРабота метода №10: invertArray");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(array);
        System.out.println("Заданный массив: " + java.util.Arrays.toString(array));


        System.out.println("\nРабота метода №11: fillArray");
        int[] filledArray = fillArray();
        System.out.println("Искомый массив: " + java.util.Arrays.toString(filledArray));


        System.out.println("\nРабота метода №12: multiplyLessThanSix");
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        multiplyLessThanSix(numbers);
        System.out.println("Изменённый массив: " + java.util.Arrays.toString(numbers));


        System.out.println("\nРабота метода №13: fillDiagonal");
        int[][] squareArray = new int[5][5];
        fillDiagonal(squareArray);
        System.out.println("Диагональный массив:");
        for (int[] row : squareArray) {
            System.out.println(java.util.Arrays.toString(row));
        }


        System.out.println("\nРабота метода №14: createArray");
        int[] customArray = createArray(5, 10);
        System.out.println("Искомый одномерный массив: " + java.util.Arrays.toString(customArray));
    }
}
