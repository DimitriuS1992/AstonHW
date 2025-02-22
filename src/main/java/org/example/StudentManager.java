package org.example;

import java.util.HashSet;
import java.util.Set;


public class StudentManager {


    public static void removeUnderperformingStudents(Set<Student> students) {
        students.removeIf(student -> student.getAverageGrade() < 3);
    }


    public static void promoteStudents(Set<Student> students) {
        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }


    public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты на курсе " + course + ":");
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}