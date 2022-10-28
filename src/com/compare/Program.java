package com.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Student student1 = new Student(1, "A", 7f);
        Student student2 = new Student(2, "B", 8f);
        Student student3 = new Student(3, "C", 4f);
        Student student4 = new Student(4, "D", 1f);
        Student student5 = new Student(5, "E", 10f);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5);

        Collections.sort(students);
        Collections.reverse(students);

        System.out.println("Danh sách học sinh: ");
        for(Student s: students){
            System.out.println(s);
        }

//        if(student2.compareTo(student1) == 1){
//            System.out.println("Học sinh 1 lớn hơn học sinh 2");
//        } else if (student2.compareTo(student1) == -1){
//            System.out.println("Học sinh 1 nhỏ hơn học sinh 2");
//        } else {
//            System.out.println("2 học sinh bằng nhau");
//        }

    }
}
