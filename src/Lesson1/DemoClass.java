package Lesson1;

import Basic.Person;

public class DemoClass {
    public static void main(String[] args) {
        //int number = 10;

        // car1 as the object of the Car class
        Car car1 = new Car("001", "blue");
        car1.showCarInfo();

        Car car2 = new Car("002", "red");
        car2.showCarInfo();

        new Car("003", "yellow").showCarInfo();

        // System.out.println("Color: " + Cloth.color);
        // System.out.println("Size: " + Cloth.size);
        // System.out.println("Logo: " + Cloth.logo);

        Cloth c1 = new Cloth("Brown", "S", "AA");
        c1.showInfo();

        Person No1 = new Person("Albert", 33);
        No1.showName();
        No1.showAge();

        Person No2 = new Person("Bella", 28);
        No2.showName();
        No2.showAge();
        System.out.println("School: " + Person.schoolName);

        Student s1 = new Student("Teacher1");
        s1.setScore1(88, "Teacher1");
        s1.setScore2(108, "Teacher1");
        s1.setScore2(65, "Teacher2");
        s1.setScore2(65, "Teacher1");

        int score1 = s1.getScore1("Teacher1");
        System.out.println(score1);
        int score2 = s1.getScore2("Teacher1");
        System.out.println(score2);
        int score3 = s1.getScore1("Teacher2");
        System.out.println(score3);

    }


}
