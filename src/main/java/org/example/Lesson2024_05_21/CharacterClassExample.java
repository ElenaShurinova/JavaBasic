package org.example.Lesson2024_05_21;

public class CharacterClassExample {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println(ch + " " + (int)ch);
        System.out.println("97 " + (char)97);

        int numASCII = 'A';
        int numValueOf = Integer.valueOf('A');
        int numNumericValue = Character.getNumericValue('A');

        System.out.println(numASCII);
        System.out.println(numValueOf);
        System.out.println(numNumericValue);
    }
}
