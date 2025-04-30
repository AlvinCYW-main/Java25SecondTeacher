package lesson2;

public class Dog extends Animal {
    public void bark(){
        System.out.println("Woof!");
    }


    @Override
    public void speak(){
        System.out.println("awawawaw!");
    }
}
