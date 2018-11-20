package com;

public class App {
    public static void main(String[] args) {
        DynamicArray<String> dynamicArray = new DynamicArray<>(8);
        dynamicArray.add("a1");
        dynamicArray.add("b2");
        dynamicArray.add("a3");
        dynamicArray.add("b4");

        dynamicArray.add("a5");
        dynamicArray.add("b6");
        dynamicArray.add("a7");
        dynamicArray.add("b8");

        dynamicArray.add("a9");
        dynamicArray.add("b10");
        dynamicArray.add("a11");
        dynamicArray.add("b12");

        dynamicArray.add("a13");
        dynamicArray.add("b14");
        dynamicArray.add("a15");
        dynamicArray.add("b16");

        dynamicArray.add("a17");

        System.out.println(dynamicArray.toString());
    }
}
