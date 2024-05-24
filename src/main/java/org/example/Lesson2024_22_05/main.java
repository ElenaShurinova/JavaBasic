package org.example.Lesson2024_22_05;

public class main {
    public static void main(String[] args) {
        System.out.println("hello world");
        print(11, "String");
        int result = sum(5, 5);
        System.out.println("Sum result: " + result);
    }

    public static void print(int num, String name) {
        System.out.println("Hello from print");
        System.out.println(num + " " + name);
    }

    public static int sum(int numA, int numB) {
        return numA + numB;
    }


}
