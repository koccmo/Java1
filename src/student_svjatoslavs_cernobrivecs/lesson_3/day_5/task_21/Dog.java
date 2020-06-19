package student_svjatoslavs_cernobrivecs.lesson_3.day_5.task_21;

public class Dog {

    private String name;
    private int age;
    private String color;

    public Dog (String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void voice(){
        System.out.println("Name: " + name + "\n" +"Age: " + age + "\n" + "Color: " + color);
    }
}
