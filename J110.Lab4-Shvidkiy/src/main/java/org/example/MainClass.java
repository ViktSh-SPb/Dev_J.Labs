package org.example;

public class MainClass {
    public static void main(String[] args) {
        BooleanArray arr = new SimpleBooleanArray();
        arr.setTrue(0);
        System.out.println("0-й элемент массива: " + arr.get(0));
        System.out.println(arr);
    }
}