package ru.sokolov;


import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Test");
        List<Integer> collection = new ArrayList<>();

        for (int i = 0; i < 100; i ++) {
            collection.add(i);
        }

        System.out.println(collection);
        System.out.println("\n\n\n");
        collection = Lists.reverse(collection);
        System.out.println(collection);

    }
}
