package roman.lesson_3.homework.day_5.task_20;

public class Dog {
    private String name;
    private int age;

    public Dog(int newAge){
        this.name = "Boby";
        this.age = newAge;
    }

    public String voice(){
        return this.name + " " + this.age;
    }
    void happyBirthday(){
        this.age++;
        System.out.println("Ai ai it my Birthday ");

    }
}
