package student_jekaterina_loseva.lesson_3.day_5.task_19;

public class Dog {

    private String name;
    private int age;

    public Dog(String dogName, int dogAge) {
        this.name = dogName;
        this.age = dogAge;
    }

    public void voice() {
        System.out.println("Dog says to command voice: " + name + " " + age);
    }

}

