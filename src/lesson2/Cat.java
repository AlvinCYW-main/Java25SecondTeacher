package lesson2;

public class Cat extends Animal {
    public void meow(){
        System.out.println("Meow~");
    }

    @Override
    public void speak(){
        System.out.println("Meh!");
    }
}
