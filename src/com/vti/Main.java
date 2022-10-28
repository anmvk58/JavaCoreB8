package com.vti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Mang Array thong thuong
//        int[] listNumbers = new int[4];
//        int[] listNumbers2 = {3, 5, 8, 91};

        // Khoi tao ArrayList rong:
        List<Integer> listNumber3 = new ArrayList<>();

        // Khoi tao ArrayList co san gia tri:
        List<Integer> listNumbers4 = Arrays.asList(15,36,47,58,91);

        // Phuong thuc  them phan tu vao arraylist:
        listNumber3.add(1);
        listNumber3.add(3);
        listNumber3.add(4);
        listNumber3.add(7);
        listNumber3.add(11);
        listNumber3.add(18);

        // Phương thức cho biết Arraylist đang có bao nhiêu phần tử:
        System.out.println("Số phần tử của ArrayList 3 là: " + listNumber3.size());

        // Phương thức dùng để lấy giá trị của 1 phần tử trong ArrayList:
        System.out.println("Phần tử thứ 4 của ArrayList là: " + listNumber3.get(3));

        // Phương thức dùng để remove đi 1 phần tử trong mảng (dựa theo index):
        System.out.print("Mảng trước khi remove: ");
        for(Integer i : listNumber3){
            System.out.print(i + ", ");
        }
//        System.out.println("Loại bỏ phần tử THỨ 3: ");
        listNumber3.remove(2);

        System.out.println("\nLoại bỏ đi phần tử 7");
        Integer i7 = new Integer(7);
        listNumber3.remove(i7);

        System.out.print("Mảng sau khi remove là: ");
        for(Integer i : listNumber3){
            System.out.print(i + ", ");
        }

        // Làm rỗng ArrayList:
        listNumber3.clear();
        System.out.println("\nArray List sau khi clear: ");
        for(Integer i : listNumber3){
            System.out.print(i + ", ");
        }

    }
}
