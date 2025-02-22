package org.example;

public class task9 {
    public static boolean leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true; // Високосный год
        } else {
            return false; // Не високосный год
        }
    }
}
