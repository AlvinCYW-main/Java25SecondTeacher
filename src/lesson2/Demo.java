package lesson2;

import lesson3.*;

public class Demo {
    
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.speak();

        Dog d1 = new Dog();
        d1.speak();
        d1.bark();

        Cat c1 = new Cat();
        c1.meow();
        c1.speak();

        MessagePrinter m1 = new MessagePrinter();
        m1.printMessage("aaaa");
        m1.printMessage(2.2, 3.3);
        m1.printMessage(9, 8, "bbb");


        Person p1 = new Person("AAA", 88);
        p1.introduce();

        Student s1 = new Student("BBB", 66, "FFF");
        s1.introduce();

        ColledgeStudent c2 = new ColledgeStudent("CCC", 33, "RRR", "OOO");
        c2.introduce();
    }

}
