package org.example.homeworks.hw2024_05_23;

public class ArithmeticOperations {
    // Метод для сложения //add=принимает два целых числа и возвращает сумму
    public static int add(int a, int b) {
        return a + b;
    }

    // Метод для вычитания // subtract=принимает два целых числа и возвращает их разность
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Метод для умножения // multiply=принимает два целых числа и возвращает их произведение(умножение)
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Метод для деления // divide= принимает два целых числа и возвращает результат их деления
    // в виде double В случае деления на ноль выводит сообщение об ошибке и возвращает Double.NaN
    // (Not a Number)
    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Ошибка: Деление на ноль!");
            return Double.NaN;
        }
    }

    public static void main(String[] args) {
        // Примеры чисел для операций
        int num1 = 25;
        int num2 = 5;

        // Вызов методов и вывод результатов
        int additionResult = add(num1, num2);
        int subtractionResult = subtract(num1, num2);
        int multiplicationResult = multiply(num1, num2);
        double divisionResult = divide(num1, num2);

        System.out.println("Результат сложения: " + additionResult);
        System.out.println("Результат вычитания: " + subtractionResult);
        System.out.println("Результат умножения: " + multiplicationResult);
        System.out.println("Результат деления: " + divisionResult);
    }
}


