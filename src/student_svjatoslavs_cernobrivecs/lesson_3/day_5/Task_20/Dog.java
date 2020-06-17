package student_svjatoslavs_cernobrivecs.lesson_3.day_5.Task_20;

public class Dog {

    private String name;
    private int age;

    public Dog (String name, int age){
        this.name = name;
        this.age = age;
    }
    public void happyBirthday(){
        for (int i = 0; i < 16; i++)
        System.out.println("Happy Birthday " + name + " " + (i + this.age));
    }
}
