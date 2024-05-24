package org.example.Work;

public class Work {
    public static void main(String[] args) {
        printFirsLastMiddleChar("I learn Java!");
    }

    public static void printFirsLastMiddleChar(String stringInput) {
        System.out.println(stringInput.charAt(0));
        //System.out.println(stringInput.charAt(stringInput.length()-1));
        //или
        int lastIndex = stringInput.length() - 1;
        char lastChar = stringInput.charAt(lastIndex);
        System.out.println(lastChar);
        if (stringInput.length() > 2 && stringInput.length() % 2 == 0) {
            System.out.println();
        }
        System.out.println(stringInput.charAt(0));

        System.out.println();
    }

}
