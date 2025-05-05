package lesson3;

public class Car {
    private String name;
    private int maxSpeed;
    
    public Car(String name, int maxSpeed){
        this.setName(name);
        this.setMaxSpeed(maxSpeed);

    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getMaxSpeed() {
        System.out.println("Name: " + this.name + ", Max: " + this.maxSpeed);
    }

    public String getName(){
        return this.name;
    }

    
}
