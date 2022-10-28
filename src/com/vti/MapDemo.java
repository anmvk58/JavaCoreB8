package com.vti;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> listMap = new HashMap<>();

        // Thêm phần tử vào Map:
        listMap.put(1, "Nhà lầu");
        listMap.put(2, "Xe hơi");
        listMap.put(100, "Trúng Vietlot");

        // Lấy phần tử trong Map để sử dụng:
//        System.out.println(listMap.get(100));

        Map<String, String> contacts = new HashMap<>();

        // Thêm vào danh bạ:
        contacts.put("An", "0982405200");
        contacts.put("Linh", "0788349223");
        contacts.put("Thảo", "0989268899");

        // Lấy ra số trong danh bạ
        System.out.println("Số điện thoại của Linh là: " + contacts.get("Linh"));


    }
}
