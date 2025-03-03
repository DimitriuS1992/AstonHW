package org.example;

public class Task1 {


    static class Animal {

        static int animalCount = 0;
         static int catCount = 0;
         static int dogCount = 0;

        String name;


        public Animal(String name) {
            this.name = name;
            animalCount++;
        }


        public void run(int distance) {
            System.out.println(name + " бежит " + distance + " м.");
        }


        public void swim(int distance) {
            System.out.println(name + " плывет " + distance + " м.");
        }
    }


    static class Dog extends Animal {
        // Конструктор
        public Dog(String name) {
            super(name);
            dogCount++;
        }


        @Override
        public void run(int distance) {
            if (distance <= 500) {
                super.run(distance);
            } else {
                System.out.println(name + " не может пробежать " + distance + " м. (максимум 500 м.)");
            }
        }


        @Override
        public void swim(int distance) {
            if (distance <= 10) {
                super.swim(distance);
            } else {
                System.out.println(name + " не может проплыть " + distance + " м. (максимум 10 м.)");
            }
        }
    }


    static class Cat extends Animal {
        boolean isHungry = true;


        public Cat(String name) {
            super(name);
            catCount++;
        }


        @Override
        public void run(int distance) {
            if (distance <= 200) {
                super.run(distance);
            } else {
                System.out.println(name + " не может пробежать " + distance + " м. (максимум 200 м.)");
            }
        }


        @Override
        public void swim(int distance) {
            System.out.println(name + " не умеет плавать.");
        }


        public void eatFromBowl(Bowl bowl, int amount) {
            if (bowl.decreaseFood(amount)) {
                isHungry = false; // Кот сыт
                System.out.println(name + " поел и теперь сыт.");
            } else {
                System.out.println(name + " не смог поесть. В миске недостаточно еды.");
            }
        }
    }


    static class Bowl {
        private int foodAmount; // Количество еды в миске


        public Bowl(int foodAmount) {
            this.foodAmount = foodAmount;
        }


        public void addFood(int amount) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " еды. Теперь в миске " + foodAmount + " еды.");
        }


        public boolean decreaseFood(int amount) {
            if (foodAmount >= amount) {
                foodAmount -= amount;
                return true;
            }
            return false;
        }
    }


        public static void main(String[] args) {

            Dog dog = new Dog("Бобик");
            Cat cat1 = new Cat("Мурзик");
            Cat cat2 = new Cat("Барсик");


            dog.run(550);
            dog.swim(8);
            cat1.run(100);
            cat2.swim(8);


            Bowl bowl = new Bowl(30);
            cat1.eatFromBowl(bowl, 20);
            cat2.eatFromBowl(bowl, 15);


            System.out.println("Мурзик сыт: " + !cat1.isHungry);
            System.out.println("Барсик сыт: " + !cat2.isHungry);


            bowl.addFood(20);
            cat2.eatFromBowl(bowl, 15);


            System.out.println("Всего животных: " + Animal.animalCount);
            System.out.println("Всего котов: " + Animal.catCount);
            System.out.println("Всего собак: " + Animal.dogCount);
        }
    }

