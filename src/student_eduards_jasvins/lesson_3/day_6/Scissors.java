package student_eduards_jasvins.lesson_3.day_6;

public class Scissors {

    private String material;
    private String color;
    private int length;

    public Scissors(String material, String color, int length) {
        this.material = material;
        this.color = color;
        this.length = length;
    }

    public void setMaterial() { System.out.println(" Scissors material is "+  this.material); }
    public void setColor() {System.out.println(" Scissors color is "+ this.color); }
    public void setLength() {System.out.println(" Scissors length is " + this.length + " cm"); }
}
