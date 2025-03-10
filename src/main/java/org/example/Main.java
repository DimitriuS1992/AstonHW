package org.example;

public class Main {
    public static void main(String[] args) {

        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };


        String[][] incorrectDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "X", "12"}, // Ошибка здесь
                {"13", "14", "15", "16"}
        };


        String[][] incorrectSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };


        try {
            System.out.println("Сумма элементов массива: " + ArrayProcessor.processArray(correctArray));
        } catch (MyArrayException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


        try {
            System.out.println("Сумма элементов массива: " + ArrayProcessor.processArray(incorrectDataArray));
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка в данных: " + e.getMessage() + " в ячейке [" + e.getRow() + "][" + e.getCol() + "]");
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        }


        try {
            System.out.println("Сумма элементов массива: " + ArrayProcessor.processArray(incorrectSizeArray));
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            throw new RuntimeException(e);
        }


        try {
            int[] array = new int[5];
            System.out.println(array[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        }
    }
}