public class Cloth {

    //// Without constructor
    // public static String color = "Brown";
    // public static String size = "S";
    // public static String logo = "AA";

    public String color = "";
    public String size = "";
    public String logo = "";

    public Cloth(String inputColor, String inputSize, String inputLogo){
        this.color = inputColor;
        this.size = inputSize;
        this.logo = inputLogo;
    }

    public void showInfo(){
        System.out.println("Color: " + color + ", size: " + size + ", logo: " + logo);
    }
}
