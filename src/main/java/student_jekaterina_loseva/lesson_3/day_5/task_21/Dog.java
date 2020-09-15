package student_jekaterina_loseva.lesson_3.day_5.task_21;

public class Dog {

    private String name;
    private int age;
    private String color;

    public Dog(String dogName, int dogAge, String dogColor) {
        this.name = dogName;
        this.age = dogAge;
        this.color = dogColor;
    }

    public void voice() {
        System.out.println("Dog says to command voice: " + name + " " + age + " " + color);
    }



}
