package com.newlecture.ex16StreamApi;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray, (o1,o2)->o1.compareTo(o2)); // lambda expression
        System.out.println(Arrays.toString(stringArray));
        Arrays.sort(stringArray, String::compareTo); // 레퍼런스만 알려주면 내가 알아서 만들어줄게 단, o1 o2가 순서대로 들어갈 때
        System.out.println(Arrays.toString(stringArray));


    }
}
