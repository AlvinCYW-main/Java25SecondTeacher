package lesson3;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String school){
        super(name, age);
        this.setSchool(school);
    }

    public void setSchool(String school) {
        this.school = school;
    }


    public String getSchool() {
        return school;
    }

    @Override
    public void introduce(){
        System.out.println("I am " + getName() + ", " + getAge() +" years old, from " + this.getSchool() + ".");
    }
    
    
}
