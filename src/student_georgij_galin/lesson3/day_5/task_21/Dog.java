package student_georgij_galin.lesson3.day_5.task_21;

public class Dog {
    private final String name;
    private final int age;
    private final String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void voice() {
        System.out.println("Dog parametrs : ");
        System.out.println("Dog name : " + name);
        System.out.println("Dog age : " + age);
        System.out.println("Dog color : " + color);
    }
}
