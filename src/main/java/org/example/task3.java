package org.example;

public class task3 {
    public static void printColor() {
        int value = 42;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }
}
