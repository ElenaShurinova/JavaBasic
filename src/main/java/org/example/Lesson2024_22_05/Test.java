package org.example.Lesson2024_22_05;

public class Test {
    public static void main(String[] args) {
        cat cat = new cat();
        System.out.println(cat.name + " " + cat.age);
        cat tom = new cat("Tom");
        System.out.println(tom.name + " " +  tom.age);
        cat jerry = new cat("Jerry", 5);
        System.out.println(jerry.name + " " + jerry.age);
    }
    }

