package student_igors_bartkevics.lesson_3.homeworks.day_6.task_24;

public class Guitar {

    private int numberOfStrings;
    private String guitarType;
    private String manufacturer;
    private String model;

    public Guitar(int numberOfStrings, String guitarType){
        this.numberOfStrings = numberOfStrings;
        this.guitarType = guitarType;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void play(){
        System.out.println("Now is playing " + manufacturer + " " + model + " " + numberOfStrings +
                "-string " + guitarType + " guitar");
    }
}
