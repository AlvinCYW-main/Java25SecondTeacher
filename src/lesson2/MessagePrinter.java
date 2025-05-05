package lesson2;

public class MessagePrinter {
    public void printMessage(String message){
        System.out.println(message);
    }
    public void printMessage(double num1, double num2){
        System.out.println(num1 +", "+ num2);
    }
    public void printMessage(int num1, int num2, String message){
        System.out.println(num1 +", "+ num2 + ", " + message);
    }
}
