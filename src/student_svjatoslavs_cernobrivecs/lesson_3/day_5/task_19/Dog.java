package student_svjatoslavs_cernobrivecs.lesson_3.day_5.task_19;

public class Dog {

    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void voice(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
