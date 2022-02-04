package roman.lesson_3.homework.day_5.task_21;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(int newAge,String newColor){
        this.name = "Boby";
        this.age = newAge;
        this.color = newColor;
    }

    public String voice(){
        return name + " " + age + " " + color;
    }
}
