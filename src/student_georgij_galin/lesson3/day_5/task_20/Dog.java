package student_georgij_galin.lesson3.day_5.task_20;

public class Dog {
    public String name;
    public int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println("My name is: " + name);
        System.out.println("My ages is " + age);
    }

    public void happyBirthday() {
        this.age = age + 1;
        System.out.println("Today is my Birthday :");
        System.out.println("Now my ages is :" + age + " years");
    }
}