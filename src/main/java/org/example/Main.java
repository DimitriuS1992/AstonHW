package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class Main {
    public static void main(String[] args) {

        Set<Student> students = new HashSet<>();
        students.add(new Student("Иосиф Сталин", "Группа 1", 1, List.of(4.5, 3.0, 2.5)));
        students.add(new Student("Лаврентий Берия", "Группа 2", 2, List.of(5.0, 4.0, 3.5)));
        students.add(new Student("Леонид Брежнев", "Группа 1", 1, List.of(2.0, 2.5, 3.0)));
        students.add(new Student("Владимир Ленин", "Группа 3", 3, List.of(4.0, 4.5, 5.0)));


        System.out.println("Все студенты:");
        students.forEach(System.out::println);


        StudentManager.removeUnderperformingStudents(students);
        System.out.println("\nСтуденты после удаления:");
        students.forEach(System.out::println);


        StudentManager.promoteStudents(students);
        System.out.println("\nСтуденты после перевода на следующий курс:");
        students.forEach(System.out::println);


        StudentManager.printStudents(students, 2);


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Сталин", "123-456");
        phoneBook.add("Берия", "789-012");
        phoneBook.add("Сталин", "345-678");

        System.out.println("\nТелефоны для Сталина: " + phoneBook.get("Сталин"));
        System.out.println("Телефоны для Брежнева: " + phoneBook.get("Брежнев"));
    }
}