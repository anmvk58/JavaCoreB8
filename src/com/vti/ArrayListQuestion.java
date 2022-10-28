package com.vti;

import java.util.*;

public class ArrayListQuestion {
    public static void main(String[] args) {
        //Khởi tạo ArrayList Student
        List<Student> students = new ArrayList<>();

        // Thêm các học sinh
        students.add(new Student("Nguyễn Văn A"));
        students.add(new Student("Trần Cảnh B"));
        students.add(new Student("Nguyễn Văn A"));
        students.add(new Student("Lê Nguyên C"));
        students.add(new Student("Đỗ Ngọc D"));
        students.add(new Student("Nguyễn Văn A"));
        students.add(new Student("Trần Trung E"));

        // a) in ra tổng số học sinh
        System.out.println("Tổng số học sinh là = " + Student.count);

        // b) In ra học sinh thứ 4:
        System.out.println("Học sinh thứ 4: " + students.get(3).toString());

        // c) In phần tử đầu và cuối:
        System.out.println("Học sinh đầu tiên: " + students.get(0).toString());
        System.out.println("Học sinh cuối cùng: " + students.get(students.size()-1).toString());

        // d) Thêm phần tử vào đầu danh sách:
        students.add(0, new Student("VTI Academy"));
        System.out.println("\nDanh sách học sinh:");
        for(Student s : students){
            System.out.println(s.toString());
        }

        // e) Thêm phần tử vào vị trí cuối:
        System.out.println("Thêm học sinh vào cuối danh sách:");
        students.add(new Student("Nguyễn Đức Độ"));
        System.out.println("\nDanh sách học sinh:");
        for(Student s : students){
            System.out.println(s.toString());
        }

        // f) Đảo ngược danh sách students:
        System.out.println("\nDanh sách từ cuối lên");
//        for(int i = students.size() - 1; i >= 0; i-- ){
//            System.out.println(students.get(i).toString());
//        }
        Collections.reverse(students);
        for(Student s : students){
            System.out.println(s.toString());
        }

        // g)Tạo 1 method tìm kiếm student theo ID
        int idNeedToFind = 10;
        System.out.println("\nTìm kiếm học sinh có ID = " + idNeedToFind + " :");
        findStudentById(students, idNeedToFind);

        // h)Tạo 1 method tìm kiếm student theo Name
        String nameNeedToFind = "Lê Nguyên C";
        System.out.println("\nTìm kiếm học sinh có tên = " + nameNeedToFind);
        findStudentByName(students, nameNeedToFind);

//       k) Tạo 1 ArrayList tên là studentCopies và add tất cả students vào  studentCopies
        System.out.println("\n Tạo Student Copies \n");
        List<Student> studentCopies = new ArrayList<>();
        // Cách 1: Sử dụng vòng lặp
//        for(Student s : students){
//            studentCopies.add(s);
//        }

        // Cách 2: sử dụng thư viện
        studentCopies.addAll(students);
        for(Student s : studentCopies){
            System.out.println(s);
        }

        // i) Tạo 1 method để in ra các student có trùng tên
        System.out.println("Tìm ra học sinh bị trùng");
        // Cách sử dụng Set
//        Set<String> listOnlyStudent = new HashSet<String>();
//        for(Student s : students){
//            if(listOnlyStudent.add(s.getName()) == false){
//                System.out.println(s);
//            }
//        }

        // Cách sử dụng vòng lặp
        for(int i = 0; i < students.size(); i++){
            for(int j = i + 1; j < students.size(); j++){
                if(students.get(i).getName().equals(students.get(j).getName())){
                    System.out.println(students.get(i));
                }
            }
        }

    }

    // g)Tạo 1 method tìm kiếm student theo ID
    public static void findStudentById(List<Student> students, int id){
        boolean isFind = false;
        for(Student s : students){
            if(s.getId() == id){
                System.out.println(s);
                isFind = true;
            }
        }

        if(isFind == false){
            System.out.println("Không tồn tại học sinh có ID = " + id);
        }
    }

    // h)Tạo 1 method tìm kiếm student theo Name
    public static void findStudentByName(List<Student> students, String name){
        boolean isFind = false;
        for(Student s : students){
            if(s.getName().equals(name)){
                System.out.println(s);
                isFind = true;
            }
        }

        if(isFind == false){
            System.out.println("Không tồn tại học sinh có Tên = " + name);
        }
    }
}
