package org.example.homeworks.hw_2024_05_21;

import java.util.Locale;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String str = new String("I study Basic Java!");
        workWithStr(str);
//        Task 2
        System.out.println(addingNumbers(2, 3));
        System.out.println("Результат вычитания: " + substNumbers(6, 3));
        System.out.println(divNumbers(5, 3));
        System.out.println(multyNumbers(2, 3));
//      Task 3
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = scan.next();
        System.out.println("Добрый день " + name + " !");
//      Task 4
        System.out.println("Ваше имя начинается с символа <" +
                name.charAt(0) +
                "> и заканчивается на символ <" +
                name.charAt(name.length() - 1) +
                ">.");
    }

    public static void workWithStr(String stroka){
        System.out.println(stroka.charAt(stroka.length() - 2));
        System.out.println(stroka.contains("Java"));
        System.out.println(stroka.substring(14,18));
        System.out.println(stroka.replace('a','o'));
        System.out.println(stroka.toLowerCase());
        System.out.println(stroka.toUpperCase());
    }

    public static int addingNumbers(int a , int b){
        return a + b;
    }

    public static int substNumbers(int a , int b){
        return a - b;
    }

    public static int divNumbers(int a , int b){
        return a / b;
    }

    public static int multyNumbers(int a , int b){
        return a * b;
    }








    }




