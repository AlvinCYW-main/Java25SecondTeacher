package lesson2;

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
    }

}
