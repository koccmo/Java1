package roman.lesson_3.homework.day_6.task_24;

public class Flashlight {

    private String name;
    private String color;
    private int leight;

    public Flashlight(String newColor, int newLeight){
        this.name = "Mini";
        this.color = newColor;
        this.leight = newLeight;
    }

    public void light() {
        System.out.println(name + " Make a light -----------");
    }

    public void flashing() {
        System.out.println(name + " " + color + " Make a Flashing ------   ------  ------  ------");
    }
}
