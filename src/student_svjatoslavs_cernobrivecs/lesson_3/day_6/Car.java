package student_svjatoslavs_cernobrivecs.lesson_3.day_6;

public class Car {

    private String mark;
    private String color;
    private int horsePower;

    public Car(String mark, String color, int horsePower){
        this.mark = mark;
        this.color = color;
        this.horsePower = horsePower;
    }
    public void startEngine(){
        System.out.println("Mark: " + mark + "\n" + "Color: " + color + "\n" + "Horsepower: " + horsePower);
        System.out.println("Engine Starts in : 3 2 1" + "\n" + "Engine started");
    }
}
