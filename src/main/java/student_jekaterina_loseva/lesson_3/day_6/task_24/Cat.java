package student_jekaterina_loseva.lesson_3.day_6.task_24;

public class Cat {

    private String name;
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void catGreeting() {
        System.out.println("Cat says: Hello my name is " + name + " I'm " +
                color + " and " + age + "years old");
    }

    public void catSleeping() {
        System.out.println("Cat " + name + " says: murrrrr...");
    }

}
