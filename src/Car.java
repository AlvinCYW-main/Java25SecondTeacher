public class Car {
    //property
    public String color;
    public String number;
    public int year = 0;

    //initialize the class
    public Car(String inputNumber, String inputColor){
        this.color = inputColor;
        this.number = inputNumber;
    }

    //method
    public void showCarInfo(){
        System.out.println("Car number: " + this.number + " & color: " + this.color);
    }
}
