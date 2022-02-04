package roman.lesson_3.homework.day_5.task_19;

public class Cat {
    private String name;
    private int age;

    public Cat(int correctAge){
        this.name = "Black";
        this.age = correctAge;
    }

    public String barking(){ return this.name + " + " + this.age;
    }
}
