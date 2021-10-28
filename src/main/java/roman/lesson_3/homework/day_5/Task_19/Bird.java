package roman.lesson_3.homework.day_5.Task_19;

public class Bird {
    private String name;
    private String color;
    private int age;

    public Bird(String newName, String newColor, int newAge){
        this.name = newName;
        this.color = newColor;
        this.age = newAge;
    }

    public String singing(){return name + " " + color + " " + age;
    }
}
