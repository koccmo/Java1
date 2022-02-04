package roman.lesson_3.homework.day_5.task_19;



public class Mouse {
    private String name;
    private String color;
    private int age;

    public Mouse(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String squeak(){ return name + " " + color + " " + age;
    }
}
