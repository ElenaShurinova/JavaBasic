package org.example.Lesson2024_05_23;

public class Main {
    public static void main(String[] args) {
Haus myHaus = new Haus(  3,  5, "Address");
        System.out.println(myHaus.getFloor() + " " + myHaus.getRooms() + " " + myHaus.getAddress());


       Student vasiaStudent = new Student("Vasia", 18, "middle");
        System.out.println(vasiaStudent.getName() + " " + vasiaStudent.getAge() + " " + vasiaStudent.getEducation());

        Cat mCat = new Cat("Matrosskin", 12, "Black");
        System.out.println(mCat.getName() + " " + mCat.getAge() + " " + mCat.getColor() );
    }


}
