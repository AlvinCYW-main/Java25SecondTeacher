package lesson3;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.setName(name);
        this.setAge(age);
    }

    public void introduce(){
        System.out.println("I am " + this.getName() + ", " + this.getAge() +" years old." );
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

}
