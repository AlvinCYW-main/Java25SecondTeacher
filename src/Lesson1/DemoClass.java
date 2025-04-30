package lesson1;

import basic.Person;

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


    }


}
