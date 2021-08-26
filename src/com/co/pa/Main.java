package com.co.pa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        HashMap<String, Integer> map = new HashMap<>(Map.of("A", 0, "B", 1, "C", 2));
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < 3; i++)
            set.add(scanner.nextInt());

        String order = scanner.next();
        Integer[] values = set.stream().toArray(Integer[]::new);
        for(int i = 0; i < 3; i++){
            char value = order.charAt(i);
            int index = map.get(String.valueOf(value));
            result.append(values[index]).append(" ");
        }

        System.out.println(result);
    }
}
