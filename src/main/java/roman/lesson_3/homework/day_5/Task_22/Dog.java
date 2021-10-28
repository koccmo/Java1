package roman.lesson_3.homework.day_5.Task_22;

public class Dog {
    private String name;
    private int age;
    private String color;

    public Dog(int age,String color){
        this.name = "Boby";
        this.age = age;
        this.color = color;
    }

    public String voice(){
        return name + " " + age + " " + color;
    }
    public void changeColor(String newColor){
        this.color = newColor;
    }
    public void changeAge(int newAge){
        this.age = newAge;
    }
}
