package org.example.Lesson2024_22_05;

public class ConstructoTest {
    public static void main(String[] args) {
        //String str = new String("Java");
        //System.out.println(str);
        //StringBuilder sb = new StringBuilder("string bulder");
        //System.out.println(sb);
        Student student = new Student();
        System.out.println(student.name + " " + student.age + " " + student.group);
        Student tom = new Student("Tom");
        System.out.println(tom.name + " " + tom.age + " " + tom.group);
        Student joe = new Student("Joe", 25, "SomeGroup");
        System.out.println(joe.name + " " + joe.age + " " + joe.group);




    }
}
