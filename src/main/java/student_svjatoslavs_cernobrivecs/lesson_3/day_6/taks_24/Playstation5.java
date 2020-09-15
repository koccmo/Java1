package student_svjatoslavs_cernobrivecs.lesson_3.day_6.taks_24;


public class Playstation5 {

    private String color;
    private int hardDriveStorage;
    private boolean price;

    public Playstation5 (String color,int hardDriveStorage, boolean price){
        this.color = color;
        this.hardDriveStorage = hardDriveStorage;
        this.price = price;
    }
    public void trunOn(){
        System.out.println("Playstation 5:" + "\n" + color + "\n" +
                hardDriveStorage + "GB" + "\n" + "Expencive? " + price + "!");
    }
        }
