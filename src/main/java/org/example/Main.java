package org.example;

// Задача 1
class Product {

    String name;
    String productionDate;
    String manufacturer;
    String countryOfOrigin;
    double price;
    boolean isReserved;


    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, double price, boolean isReserved) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isReserved = isReserved;
    }


    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " USD");
        System.out.println("Забронирован: " + (isReserved ? "Да" : "Нет"));
        System.out.println(); // Пустая строка для разделения вывода
    }
}

// Задача 3
class Park {

    static class Attraction {
        String name;
        String workingHours;
        double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }


        public void displayInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " USD");
            System.out.println(); // Пустая строка для разделения вывода
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Задача 2
        Product[] productArray = new Product[5];

        productArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productArray[1] = new Product("iPhone 15 Pro", "15.09.2023", "Apple Inc.", "USA", 1299, false);
        productArray[2] = new Product("Xiaomi Mi 12", "20.03.2022", "Xiaomi Corp.", "China", 799, true);
        productArray[3] = new Product("Google Pixel 7", "10.10.2022", "Google LLC", "USA", 899, false);
        productArray[4] = new Product("OnePlus 10 Pro", "05.05.2022", "OnePlus Ltd.", "China", 999, true);


        System.out.println("Информация о товарах:");
        for (Product product : productArray) {
            product.displayInfo();
        }

        // Задача 3:
        Park park = new Park();

        Park.Attraction attraction1 = new Park.Attraction("Колесо обозрения", "10:00 - 22:00", 15.0);
        Park.Attraction attraction2 = new Park.Attraction("Американские горки", "11:00 - 20:00", 10.0);
        Park.Attraction attraction3 = new Park.Attraction("Карусель", "09:00 - 18:00", 5.0);


        System.out.println("Информация об аттракционах:");
        attraction1.displayInfo();
        attraction2.displayInfo();
        attraction3.displayInfo();
    }
}