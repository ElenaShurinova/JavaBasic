package org.example.Lesson2024_05_23;

public class Student {
    private  String name;
    private int age;
    private String education;

    public Student (String name, int age, String education){
        this.age = age;
        this.name = name;
        this.education = education;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;

    }
    public String getEducation(){
        return this.education;
    }
}
