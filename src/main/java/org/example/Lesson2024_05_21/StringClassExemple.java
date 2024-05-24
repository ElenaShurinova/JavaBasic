package org.example.Lesson2024_05_21;

import java.util.Objects;

public class StringClassExemple {
    public static void main(String[] args) {
        String str = "I learn Java";
//        System.out.println("Length - " + str.length());
//        System.out.println("Substring - " + str.substring(8, 10));
//        System.out.println("charAt - " + str.charAt(2));
//        System.out.println("Before " + str);
//        System.out.println("After " + str.toUpperCase());
//        System.out.println("After " + str.toLowerCase());
//        System.out.println(str.indexOf("Java"));
//        System.out.println(str.indexOf("Java1"));
        String answer = "y";
        System.out.println(Objects.equals(answer.toLowerCase(),"y"));
    }
}
