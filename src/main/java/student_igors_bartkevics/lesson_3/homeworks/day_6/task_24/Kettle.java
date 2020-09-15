package student_igors_bartkevics.lesson_3.homeworks.day_6.task_24;

public class Kettle {

    private int kettlePower;
    private double kettleVolume;
    private String manufacturer;

    //Constructor
    public Kettle(String manufacturer){
        this.manufacturer = manufacturer;

    }

    //setter for power of kettle
    public void setKettlePower(int kettlePower) {
        this.kettlePower = kettlePower;
    }

    //setter for volume of kettle
    public void setKettleVolume(double kettleVolume){
        this.kettleVolume = kettleVolume;
    }

    public void switchOn(){
        System.out.println(manufacturer + " " + kettleVolume + " L " + kettlePower + "W " +
                "kettle is switched on!");
        System.out.println("Kettle is heating water");
        System.out.println("...");
    }

    public void switchOff(){
        System.out.println("Water is boiled!");
        System.out.println(manufacturer + " " + kettleVolume + " L " + kettlePower + "W " +
                " kettle is switched off.");
    }

}
