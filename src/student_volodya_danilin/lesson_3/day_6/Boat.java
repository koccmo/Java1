package student_volodya_danilin.lesson_3.day_6;

public class Boat {

    private String boatName;
    private String boatColor;
    private int boatPrice;


        Boat(String boatName, String boatColor, int boatPrice){
            this.boatName = boatName;
            this.boatColor = boatColor;
            this.boatPrice = boatPrice;
        }



public void boatInfo(){
    System.out.println("Name: " + boatName);
    System.out.println("Color: " + boatColor);
    System.out.println("Price: " + boatPrice);
    }
}