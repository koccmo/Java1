package student_eduards_jasvins.lesson_3.day_6;

public class Wallet {

    private String color;
    private String material;
    private String model;

    public Wallet(String color, String material, String model){
        this.color = color;
        this.material = material;
        this.model = model;
    }

    public void setColor() {System.out.println("Wallet color is = " + this.color);}
    public void setMaterial() {System.out.println("Wallet material is = " + this.material);}
    public void setModel() {System.out.println("Wallet model is = " + this.model);}
}


