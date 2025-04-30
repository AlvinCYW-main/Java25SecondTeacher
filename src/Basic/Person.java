package Basic;
public class Person {
    public String name;
    public int age;
    
    public static String schoolName = "TT";

    public Person(String inputName, int inputAge){
        this.name = inputName;
        this.age = inputAge;
    }

    public void showName(){
        System.out.println("Name: " + this.name);
    }

    public void showAge(){
        System.out.println("Age: " + this.age);
    }

}
