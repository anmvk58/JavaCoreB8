package com.vti;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();

        // thêm phần tử vào set:
        numbers.add(15);
        numbers.add(52);
        numbers.add(25);
        numbers.add(15);
        numbers.add(15);
        numbers.add(19);

        Iterator<Integer> iterator = numbers.iterator();

        while (true){
            if(iterator.hasNext()){
                System.out.println(iterator.next());
            } else {
                return;
            }
        }

    }
}
