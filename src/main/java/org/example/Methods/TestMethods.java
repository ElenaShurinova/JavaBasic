package org.example.Methods;

public class TestMethods {
    public static void main(String[] args) {
        getSum(11, 22);
        System.out.println(getReturnSum(4, 44));
    }
// Создайте метод getSum(int a, int b), который ничего не возвращает, и печатает
// результат суммы двух полученных чисел в консоль


    public static void getSum(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b));
    }

    //Создайте метод getReturnSum(int a, int b), который возвращает результат - сумма двух чисел,
    // а печать в консоль производит вызывающий метод.

    public static int getReturnSum(int a, int b){
        return a + b;
    }
}
