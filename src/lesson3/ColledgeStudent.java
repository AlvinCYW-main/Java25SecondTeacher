package lesson3;

public class ColledgeStudent extends Student{
    private String major;
    public ColledgeStudent(String name, int age, String School, String major){
        super(name, age, School);
        this.setGrade(major);
    }

    public void setGrade(String major) {
        this.major = major;
    }
    

    public String getMajor() {
        return major;
    }

    @Override
    public void introduce(){
        System.out.println("I am " + getName() + ", " + getAge() +" years old, from " + getSchool() + ". " + this.getMajor() +" major");
    }
    
}
