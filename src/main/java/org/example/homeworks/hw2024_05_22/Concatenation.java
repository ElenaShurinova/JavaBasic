package org.example.homeworks.hw2024_05_22;

public class Concatenation {
    public static void main(String[] args) {
        //создание двух строковых переменных
        String str1 = "hello";
        String str2 = "Elena!";
        //Конкатенация строк (соединение)
        String result = str1 + str2;
        //Вывод в консоль

        System.out.println("Конкатенация строк (соединение)" + result);


        // Перевод числа 333 из 16-ричной в 10-ричную
        String hexNumber = "333";
        int decimalFromHex = Integer.parseInt(hexNumber, 16);
        System.out.println("Число " + hexNumber + " в 16-ричной системе равно " + decimalFromHex + " в 10-ричной.");

        // Перевод числа 819 из 10-ричной в 16-ричную
        int decimalNumber = 819;
        String hexFromDecimal = Integer.toHexString(decimalNumber).toUpperCase();
        System.out.println("Число " + decimalNumber + " в 10-ричной системе равно " + hexFromDecimal + " в 16-ричной.");

        // Перевод числа 11001 из 2-ичной в 10-ричную
        String binaryNumber = "11001";
        int decimalFromBinary = Integer.parseInt(binaryNumber, 2);
        System.out.println("Число " + binaryNumber + " в 2-ичной системе равно " + decimalFromBinary + " в 10-ричной.");

        // Перевод числа 124 из 10-ричной в 2-ичную
        decimalNumber = 124;
        String binaryFromDecimal = Integer.toBinaryString(decimalNumber);
        System.out.println("Число " + decimalNumber + " в 10-ричной системе равно " + binaryFromDecimal + " в 2-ичной.");
    }
}
